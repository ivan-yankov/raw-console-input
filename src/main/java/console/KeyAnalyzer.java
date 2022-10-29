package console;

import either.Either;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class KeyAnalyzer {
    private static final Map<String, Key> keys = new HashMap<>();

    static {
        keys.put("10", Key.ENTER);
        keys.put("27", Key.ESC);
        keys.put("9", Key.TAB);

        keys.put("27.79.80", Key.F1);
        keys.put("27.79.81", Key.F2);
        keys.put("27.79.82", Key.F3);
        keys.put("27.79.83", Key.F4);

        keys.put("27.91.49.53", Key.F5);
        keys.put("27.91.49.55", Key.F6);
        keys.put("27.91.49.56", Key.F7);
        keys.put("27.91.49.57", Key.F8);

        keys.put("27.91.50.48", Key.F9);
        keys.put("27.91.50.49", Key.F10);
        keys.put("27.91.50.52", Key.F12);

        keys.put("27.79.53.80", Key.CTRL_F1);
        keys.put("27.79.53.81", Key.CTRL_F2);
        keys.put("27.79.53.82", Key.CTRL_F3);
        keys.put("27.79.53.83", Key.CTRL_F4);
        keys.put("27.91.50.51", Key.CTRL_F11);

        keys.put("27.91.50.126", Key.INSERT);
        keys.put("27.91.51.126", Key.DELETE);
        keys.put("27.91.72", Key.HOME);
        keys.put("27.91.70", Key.END);
        keys.put("27.91.53.126", Key.PAGE_UP);
        keys.put("27.91.54.126", Key.PAGE_DOWN);

        keys.put("27.91.65", Key.UP);
        keys.put("27.91.66", Key.DOWN);
        keys.put("27.91.67", Key.RIGHT);
        keys.put("27.91.68", Key.LEFT);

        keys.put("3", Key.CTRL_C);
        keys.put("22", Key.CTRL_V);
        keys.put("24", Key.CTRL_X);
        keys.put("27.91.50.59", Key.CTRL_INSERT);
        keys.put("27.91.51.59", Key.CTRL_DELETE);

        keys.put("127", Key.BACK_SPACE);
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
