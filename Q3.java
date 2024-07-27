import java.util.ArrayList;
import java.util.List;

public class Q3 {

    public static void removeDuplicates(List<Integer> list) {
        if (list == null || list.size() <= 1) {        //check if list has less than 1 or null
            return;
        }

        int i = 0;                                        //set to 0
        for (int j = 1; j < list.size(); j++) {         // repeat starting from the second element
            if (!list.get(i).equals(list.get(j))) {
                i++;                                    // move to next unique position
                list.set(i, list.get(j));       // pace the unique element at the new index
            }
        }

        while (list.size() > i + 1) {           //remove any remaining elements beyond the last unique element
            list.remove(list.size() - 1); // empty the list
        }
    }


    public static void main(String[] args) {            /// test method

        List<Integer> sortedList = new ArrayList<>();   // fill the list with some duplicates.
        sortedList.add(1);
        sortedList.add(1);
        sortedList.add(2);
        sortedList.add(3);
        sortedList.add(3);
        sortedList.add(4);

        System.out.println("Original list: " + sortedList);
        removeDuplicates(sortedList);
        System.out.println("List after removing duplicates: " + sortedList);

    }
}