import java.util.ArrayList;
import java.util.List;

public class Q2 {

    public static void splitList(List<Integer> input, List<Integer> first, List<Integer> second) {
        int size = input.size();                //size of the list
        int mid = (size + 1) / 2;               //get middle of the list

        for (int i = 0; i < mid; i++) {         // look at first half and add to list 1
            first.add(input.get(i));
        }

        for (int i = mid; i < size; i++) {      // look at first half and add to list 2
            second.add(input.get(i));
        }
    }

    public static void main(String[] args) {        //method to test the 2 lists

    }
}
