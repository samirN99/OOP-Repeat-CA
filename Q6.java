import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q6 {

        public static void main(String[] args) {

            String fileName = "sample.txt";                                         //file with the text
            Map<String, Set<Integer>> wordIndex = new HashMap<>();              //creates a hashmap top store the words and line numbers

            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;                    // variable to store each line read from the file
                int lineNumber = 0;             // keeps track of the lines numbers



                while ((line = br.readLine()) != null) {
                    lineNumber++;                                   // increment line number
                    String[] words = line.split("\\s+");            // split the lines into only words, uses the spaces as a delimiter



                    for (String word : words) {                                         //check each word in the line
                        word = word.toLowerCase();                                      // //make them lowrcase
                        wordIndex.computeIfAbsent(word, k -> new HashSet<>()).add(lineNumber);          // add to map and save the line number
                    }
                }

            } catch (IOException e) {               //?
                System.err.println("Error reading  file: " + e.getMessage());
            }


            for (Map.Entry<String, Set<Integer>> entry : wordIndex.entrySet()) {        //print the word and its corresponding line num.
                String word = entry.getKey();                               //pull the word
                Set<Integer> lines = entry.getValue();                  //get the line numbers
                System.out.println(word + ": " + lines);                    //print word and number of lines
            }
        }
    }

