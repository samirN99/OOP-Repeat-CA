import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

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
            int choice = scanner.nextInt();             // users choice is an int
            scanner.nextLine();                            //users choice is taken

            switch (choice) {                                   // dependant on users choice
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine().trim();                            // see the name and clear any spaces
                    String grade = getValidGrade();                                     // get the corresponding grade
                    grades.put(name, grade);                                            // add name and grade to the hashmap
                    System.out.println("Added " + name + " with grade " + grade);
                    break;

                case 2:
                    System.out.print("Enter student name: ");
                    name = scanner.nextLine().trim();
                    if (grades.containsKey(name)) {                         //check if student is on the hashmap
                        grades.remove(name);                                //remove name and grade from the hashmap
                        System.out.println("Removed " + name);
                    } else {
                        System.out.println(name + " not found");
                    }
                    break;

                case 3:
                    System.out.print("Enter student name: ");
                    name = scanner.nextLine().trim();
                    if (grades.containsKey(name)) {
                        String newGrade = getValidGrade();
                        grades.put(name, newGrade);                                 //change the student grade
                        System.out.println("Updated " + name + " with grade " + newGrade);
                    } else {
                        System.out.println(name + " not found");
                    }
                    break;

                case 4:
                    if (grades.isEmpty()) {
                        System.out.println("No student grades to display.");
                    } else {
                        Map<String, String> sortedGrades = new TreeMap<>(grades);
                        System.out.println("Student Grades:");
                        for (Map.Entry<String, String> entry : sortedGrades.entrySet()) {
                            System.out.println(entry.getKey() + ": " + entry.getValue());
                        }
                    }
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again!");
            }
        }
    }

    private static String getValidGrade() {                                                        // test method
        Scanner scanner = new Scanner(System.in);
        String grade;
        while (true) {
            System.out.print("Enter grade (A, A+, B, B+, C, C+, D, D+, F): ");
            grade = scanner.nextLine().trim();
            if (isValidGrade(grade)) {
                return grade;
            } else {
                System.out.println("Invalid grade. Please enter a valid grade.");
            }
        }
    }

    private static boolean isValidGrade(String grade) {
        for (String validGrade : VALID_GRADES) {
            if (validGrade.equals(grade)) {
                return true;
            }
        }
        return false;
    }
}

