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

        List<Integer> input = new ArrayList();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);


        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();


        splitList(input,first,second);


        System.out.println("Input List:" + input);
        System.out.println("First Half:" + first);
        System.out.println("Second Half: " + second);
    }
}
