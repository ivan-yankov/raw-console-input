package console;

public class Main {
    public static void main(String[] args) {
        System.out.print("Press a key...");
        Key k = ConsoleReader.readKey(true);

        System.out.println();
        System.out.println("Key: " + k.getName());
    }
}
