package yankov.console;

import yankov.jutils.functional.Either;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class KeyAnalyzer {
    private static final Map<String, Key> keys = new HashMap<>();

    static {
        new BufferedReader(
                new InputStreamReader(
                        Objects.requireNonNull(KeyAnalyzer.class.getResourceAsStream("/keys.txt"))
                )
        ).lines().forEach(x -> {
            List<String> cols = Arrays.stream(x.split("\\|")).map(String::trim).collect(Collectors.toList());
            String name = cols.get(0);
            String code = cols.stream().skip(1).collect(Collectors.joining("."));
            keys.put(code, Arrays.stream(Key.values()).filter(y -> y.getName().equals(name)).findFirst().orElse(Key.UNKNOWN));
        });
    }

    public static Either<String, Key> analyzeKey(int[] code) {
        String c = Arrays.stream(code).asLongStream().mapToObj(String::valueOf).collect(Collectors.joining("."));
        Key k = keys.get(c);
        if (k == null) {
            return Either.left(c);
        } else {
            return Either.right(k);
        }
    }
}
