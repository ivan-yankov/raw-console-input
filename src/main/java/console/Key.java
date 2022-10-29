package console;

public enum Key {
    ENTER("Enter"), ESC("Esc"), TAB("Tab"),
    F1("F1"), F2("F2"), F3("F3"), F4("F4"), F5("F5"), F6("F6"), F7("F7"), F8("F8"), F9("F9"), F10("F10"), F12("F12"),
    CTRL_F1("CTRL+F1"), CTRL_F2("CTRL+F2"), CTRL_F3("CTRL+F3"), CTRL_F4("CTRL+F4"), CTRL_F11("CTRL+F11"),
    INSERT("Ins"), DELETE("Del"), HOME("Home"), END("End"), PAGE_UP("PageUp"), PAGE_DOWN("PageDown"),
    CTRL_INSERT("CTRL+Ins"), CTRL_DELETE("CTRL+Del"),
    UP("Up"), DOWN("Down"), LEFT("Left"), RIGHT("Right"),
    CTRL_C("CTRL+C"), CTRL_V("CTRL+V"), CTRL_X("CTRL+X"),
    BACK_SPACE("Back"),
    PLUS("+"), MINUS("-");

    private final String name;

    Key(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
