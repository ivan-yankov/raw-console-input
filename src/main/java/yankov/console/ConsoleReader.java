package yankov.console;

import yankov.jutils.functional.Either;

public class ConsoleReader {
    public static Either<String, Key> readKey() {
        try {
            int[] code = RawConsoleInput.read(true);
            return KeyAnalyzer.analyzeKey(code);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return Either.left("");
        }
    }
}
