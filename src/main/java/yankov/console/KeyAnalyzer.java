package yankov.console;

import yankov.jfp.structures.Either;

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
            List<String> cols = Arrays.stream(x.split("\\|")).map(String::trim).toList();
            String name = cols.get(0);
            String code = cols.stream().skip(1).collect(Collectors.joining("."));
            keys.put(code, Arrays.stream(Key.values()).filter(y -> y.getName().equals(name)).findFirst().orElse(Key.UNKNOWN));
        });
    }

    public static Either<String, Key> analyzeKey(Either<byte[], int[]> input) {
        if (input.getLeft().isPresent()) {
            return Either.leftOf(new String(input.getLeft().get()));
        }

        int[] code = input.getRight().orElseThrow();
        String c = Arrays.stream(code).asLongStream().mapToObj(String::valueOf).collect(Collectors.joining("."));
        Key k = keys.get(c);
        if (k != null) {
            return Either.rightOf(k);
        } else {
            try {
                if (code.length == 1) {
                    return Either.leftOf(String.valueOf((char) code[0]));
                }
            } catch (Exception ignored) {
            }
            return Either.leftOf("Unsupported key code: " + c);
        }
    }
}
