import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Q7 {

        public static void main(String[] args) {

            String fileName = "sample.txt";                 //using the sample file text


            Set<String> uniqueWords = new HashSet<>();          //  stores unique words

            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

                String line;
                while ((line = br.readLine()) != null) {                       // read all lines in the file
                    String[] words = line.split("\\s+");                        // splits lines into words
                    for (String word : words) {                                 // converts all words into lower cases
                        uniqueWords.add(word.toLowerCase());
                    }
                }
            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
            }


            System.out.println("Unique words:");
            for (String word : uniqueWords) {
                System.out.println(word);
            }
        }
    }

