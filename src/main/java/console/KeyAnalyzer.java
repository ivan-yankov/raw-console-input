package console;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class KeyAnalyzer {
    private static final Map<String, Key> keys = new HashMap<>();

    static {
        keys.put("10", Keys.ENTER);
        keys.put("27", Keys.ESC);
        keys.put("9", Keys.TAB);

        keys.put("27.79.80", Keys.F1);
        keys.put("27.79.81", Keys.F2);
        keys.put("27.79.82", Keys.F3);
        keys.put("27.79.83", Keys.F4);

        keys.put("27.91.49.53", Keys.F5);
        keys.put("27.91.49.55", Keys.F6);
        keys.put("27.91.49.56", Keys.F7);
        keys.put("27.91.49.57", Keys.F8);

        keys.put("27.91.50.48", Keys.F9);
        keys.put("27.91.50.49", Keys.F10);
        // F11 resizes terminal window
        keys.put("27.91.50.52", Keys.F12);

        keys.put("27.79.53.80", Keys.CTRL_F1);
        keys.put("27.79.53.81", Keys.CTRL_F2);
        keys.put("27.79.53.82", Keys.CTRL_F3);
        keys.put("27.79.53.83", Keys.CTRL_F4);
        keys.put("27.91.50.51", Keys.CTRL_F11);

        keys.put("27.91.50.126", Keys.INSERT);
        keys.put("27.91.51.126", Keys.DELETE);
        keys.put("27.91.72", Keys.HOME);
        keys.put("27.91.70", Keys.END);
        keys.put("27.91.53.126", Keys.PAGE_UP);
        keys.put("27.91.54.126", Keys.PAGE_DOWN);

        keys.put("27.91.65", Keys.UP);
        keys.put("27.91.66", Keys.DOWN);
        keys.put("27.91.67", Keys.RIGHT);
        keys.put("27.91.68", Keys.LEFT);

        keys.put("3", Keys.CTRL_C);
        keys.put("22", Keys.CTRL_V);
        keys.put("24", Keys.CTRL_X);
        keys.put("27.91.50.59", Keys.CTRL_INSERT);
        keys.put("27.91.51.59", Keys.CTRL_DELETE);
    }

    public static Key analyzeKey(int[] code) {
        String c = Arrays.stream(code).asLongStream().mapToObj(String::valueOf).collect(Collectors.joining("."));
        return keys.getOrDefault(c, new Key(String.valueOf((char) code[0])));
    }
}
