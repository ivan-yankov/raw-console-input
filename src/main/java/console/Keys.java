package console;

import java.util.Arrays;
import java.util.List;

public class Keys {
    public static final Key ENTER = new Key("Enter");
    public static final Key ESC = new Key("Esc");
    public static final Key TAB = new Key("Tab");

    public static final Key F1 = new Key("F1");
    public static final Key F2 = new Key("F2");
    public static final Key F3 = new Key("F3");
    public static final Key F4 = new Key("F4");
    public static final Key F5 = new Key("F5");
    public static final Key F6 = new Key("F6");
    public static final Key F7 = new Key("F7");
    public static final Key F8 = new Key("F8");
    public static final Key F9 = new Key("F9");
    public static final Key F10 = new Key("F10");
    public static final Key F12 = new Key("F12");

    public static final Key CTRL_F1 = new Key("CTRL+F1");
    public static final Key CTRL_F2 = new Key("CTRL+F2");
    public static final Key CTRL_F3 = new Key("CTRL+F3");
    public static final Key CTRL_F4 = new Key("CTRL+F4");
    public static final Key CTRL_F11 = new Key("CTRL+F11");

    public static final Key INSERT = new Key("Ins");
    public static final Key DELETE = new Key("Del");
    public static final Key HOME = new Key("Home");
    public static final Key END = new Key("End");
    public static final Key PAGE_UP = new Key("PageUp");
    public static final Key PAGE_DOWN = new Key("PageDown");

    public static final Key UP = new Key("Up");
    public static final Key DOWN = new Key("Down");
    public static final Key LEFT = new Key("Left");
    public static final Key RIGHT = new Key("Right");

    public static final Key CTRL_C = new Key("CTRL+C");
    public static final Key CTRL_V = new Key("CTRL+V");
    public static final Key CTRL_X = new Key("CTRL+X");
    public static final Key CTRL_INSERT = new Key("CTRL+Ins");
    public static final Key CTRL_DELETE = new Key("CTRL+Del");

    public static List<Key> asList() {
        return Arrays.asList(
                ENTER, ESC, TAB, F1, F2, F3, F4, F5, F6, F7, F8, F9, F10, F12,
                CTRL_F1, CTRL_F2, CTRL_F3, CTRL_F4, CTRL_F11,
                INSERT, DELETE, HOME, END, PAGE_UP, PAGE_DOWN, UP, DOWN, LEFT, RIGHT,
                CTRL_C, CTRL_V, CTRL_X, CTRL_INSERT, CTRL_DELETE
        );
    }
}
