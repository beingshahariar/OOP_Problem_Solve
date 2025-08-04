import java.util.*;
import java.util.stream.Collectors;

public class ArrayListDemo2 {

    public static void main(String args[]) {
        // create an array list

        ArrayList<Integer> al = new ArrayList();
        System.out.println("Initial size of al: " + al.size());

        // add elements to the array list
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        // foreach iterate
        for (int i : al) {
            System.out.print(i + " ");
        }
        System.out.println();

        al.remove(2); // remove using index
        al.remove(Integer.valueOf(10)); // remove using value

    }
}