import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q4 {

    private static final String[] VALID_GRADES = {"A", "A+", "B", "B+", "C", "C+", "D", "D+", "F"}; // constant array of grades.

    public static void main(String[] args) {
        Map<String, String> grades = new HashMap<>();       // creates a hashmap to store names and grandes
        Scanner scanner = new Scanner(System.in);               // creates a scanner obj to read user input

        while (true) {                  // create an infinite loop
            System.out.println("\nOptions:");
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Modify grade");
            System.out.println("4. Print all grades");
            System.out.println("5. Quit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();



        }
