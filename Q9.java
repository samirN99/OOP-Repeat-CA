import java.util.Scanner;
import java.util.Stack;

public class Q9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);           //create a scanner to read input

        Stack<String> stack = new Stack<>();                //create a stack to store words

        System.out.println("Enter words (type 'exit' to stop):");

        // Read words from the keyboard
        while (true) {
            String word = scanner.nextLine().trim();                // single out word and trim spaces
            if (word.equalsIgnoreCase("exit")) {                // if type the word exit, stop reading
                break;
            }
            stack.push(word);               //push word into the stack
        }

        System.out.println("\nWords in reverse order:");

        // Print words in reverse order
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close(); // Close the scanner to avoid resource leaks
    }

}
