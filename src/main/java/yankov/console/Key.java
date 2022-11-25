package yankov.console;

public enum Key {
    UNKNOWN("Unknown"),

    ENTER("Enter"), ESC("Esc"), TAB("Tab"),

    F1("F1"), F2("F2"), F3("F3"), F4("F4"), F5("F5"), F6("F6"), F7("F7"), F8("F8"), F9("F9"), F10("F10"),

    CTRL_F1("Ctrl+F1"), CTRL_F2("Ctrl+F2"), CTRL_F3("Ctrl+F3"), CTRL_F4("Ctrl+F4"),
    CTRL_F5("Ctrl+F5"), CTRL_F6("Ctrl+F6"), CTRL_F7("Ctrl+F7"), CTRL_F8("Ctrl+F8"),
    CTRL_F9("Ctrl+F9"), CTRL_F10("Ctrl+F10"),

    INSERT("Ins"), DELETE("Del"), HOME("Home"), END("End"),

    CTRL_INSERT("Ctrl+Ins"), CTRL_DELETE("Ctrl+Del"), CTRL_HOME("Ctrl+Home"), CTRL_END("Ctrl+End"),

    PAGE_UP("PageUp"), PAGE_DOWN("PageDown"),

    UP("Up"), DOWN("Down"), LEFT("Left"), RIGHT("Right"),
    CTRL_UP("Ctrl+Up"), CTRL_DOWN("Ctrl+Down"), CTRL_LEFT("Ctrl+Left"), CTRL_RIGHT("Ctrl+Right"),
    ALT_UP("Alt+Up"), ALT_DOWN("Alt+Down"), ALT_LEFT("Alt+Left"), ALT_RIGHT("Alt+Right"),

    CTRL_C("Ctrl+C"), CTRL_V("Ctrl+V"), CTRL_X("Ctrl+X"),

    BACK_SPACE("Back");

    private final String name;

    Key(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
