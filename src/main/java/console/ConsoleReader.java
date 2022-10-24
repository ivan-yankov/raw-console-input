package console;

public class ConsoleReader {
    public static Key readKey() {
        try {
            int[] code = RawConsoleInput.read(true);
            return KeyAnalyzer.analyzeKey(code);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return new Key("Unknown");
        }
    }
}
