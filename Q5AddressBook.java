import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q5AddressBook {

        private Map<String, Contact> contacts;              //Map to store contacts
                                                            //uses the names of cantacts as key
        public Q5AddressBook() {
            this.contacts = new HashMap<>();                    //constructer to initialize amp
        }

        // Class to hold contact info
        private static class Contact {
            private String name;
            private String mobile;
            private String email;

            public Contact(String name, String mobile, String email) {      //constructor to initialize contact details
                this.name = name;
                this.mobile = mobile;
                this.email = email;
            }


         //   public String toString() {                                        // override toString and give all details back as a stirng
          //      return mobile + ", " + email;
        //    }
        }

        public void addContact(String name, String mobile, String email) {                                             //method to add a contact
            contacts.put(name.toLowerCase(), new Contact(name.toLowerCase(), mobile, email));
        }

        public Contact getContact(String name) {    // method to get a single person
            return contacts.get(name.toLowerCase());
        }

        public void printAddressBook() {                    //method to get all contacts
            for (Contact contact : contacts.values()) {
                System.out.println(contact.name + ": " + contact);
            }
        }

        public static void main(String[] args) {                                                //test method
            Q5AddressBook addressBook = new Q5AddressBook();

                                                                                                            // ADDed options( name, mobile, email)
            addressBook.addContact("Ben", "082-456-7890", "ben.Snders@example.com");
            addressBook.addContact("Kevin", "072-765-4321", "Kevin.smith@example.com");
            addressBook.addContact("Bob", "083-123-4567", "Bob.Johnson@example.com");

            Scanner scanner = new Scanner(System.in);               //?

            while (true) {                                      //display
                System.out.println("\nchoose an options:");
                System.out.println("1. Search for a contact");
                System.out.println("2. give all all contacts");
                System.out.println("3. Done");

                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();                                 // User input for option

                if (choice == 1) {
                    System.out.print("Enter a name to search for: ");           // search for contacts by name
                    String name = scanner.nextLine().trim();
                    Contact contact = addressBook.getContact(name);
                    if (contact != null) {
                        System.out.println("Found contact: " + contact);
                    } else {
                        System.out.println("Contact not found.");
                    }
                } else if (choice == 2) {
                    addressBook.printAddressBook();
                } else if (choice == 3) {
                    System.out.println("Goodbye!");
                    break;
                } else {
                    System.out.println("Invalid option. Try again!");
                }
            }

            scanner.close(); // Close the scanner
        }
    }
