import java.util.ArrayList;
import java.util.List;

public class Question1 {                    // Method to remove all nth numbers from the list

    public static List<Integer> removeNthItems(List<Integer> inputList, int n) {        //new method that takes lists of integers and an integer parameters
        List<Integer> resultList = new ArrayList<>();                                   //creates a new list to store results

        for (int i = 0; i < inputList.size(); i++) {                                    //for loop that repeats over all elements in the list, i is the index
            if ((i + 1) % n != 0) {                                                     // calculates if (i+1) is not div by n.
                resultList.add(inputList.get(i));                                       // will add to result list from inputlist if true
            }
        }
        return resultList;
    }
}
