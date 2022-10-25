package console;

public class ConsoleReader {
    public static Key readKey() {
        return readKey(false);
    }

    public static Key readKey(boolean printCode) {
        try {
            int[] code = RawConsoleInput.read(true);

            if (printCode) {
                System.out.println();
                System.out.println("Raw code:");

                for (int i : code) {
                    System.out.println(i);
                }
            }

                return KeyAnalyzer.analyzeKey(code);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return new Key("Unknown");
        }
    }
}
