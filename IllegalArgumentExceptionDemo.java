import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.next();

        generateException(text);
        handleException(text);
    }

    public static void generateException(String text) {
        System.out.println(text.substring(5, 2)); // This will throw IllegalArgumentException
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }
}