package yankov.console;

public class Main {
    public static void main(String[] args) {
        System.out.println("Press a key:");
        ConsoleReader.readKey().fold(
                key -> System.out.println(key.getName()),
                System.out::println
        );
    }
}
