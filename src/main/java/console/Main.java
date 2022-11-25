package console;

import yankov.jutils.functional.Either;

public class Main {
    public static void main(String[] args) {
        System.out.print("Press a key...");
        Either<String, Key> k = ConsoleReader.readKey();
        String keyName = k.getRight().isPresent() ? k.getRight().get().getName() : k.getLeft().orElse("");
        System.out.println();
        System.out.println("Key: " + keyName);
    }
}
