package yankov.console;

import yankov.jutils.functional.Either;

public class ConsoleReader {
    public static Either<String, Key> readKey() {
        try {
            Either<byte[], int[]> input = RawConsoleInput.read(true);
            return KeyAnalyzer.analyzeKey(input);
        } catch (Exception e) {
            return Either.left(e.getMessage());
        }
    }
}
