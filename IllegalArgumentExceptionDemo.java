import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String input) {
        // Setting start index greater than end index to cause exception
        int startIndex = 5;
        int endIndex = 2;
        System.out.println("Attempting to extract substring...");
        
        // This will cause a StringIndexOutOfBoundsException, which is a type of RuntimeException
        String result = input.substring(startIndex, endIndex);
        System.out.println("Extracted substring: " + result);
    }
    
    // Method to handle RuntimeException, including IllegalArgumentException
    public static void handleException(String input) {
        try {
            generateException(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        // First, generate the exception
        try {
            generateException(userInput);
        } catch (RuntimeException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
        
        // Then, handle the exception properly
        handleException(userInput);
        
        scanner.close();
    }
}
