import java.util.ArrayList;
import java.util.List;

public class                                                                                                                     ArrayListDemo1 {

    public static void main(String args[]) {
        ArrayList a = new ArrayList<>();
        a.add(10);
        a.add("abc");
        a.add(20.3);
        a.add(true);
        a.add('1');
        System.out.println(a.size());
        System.out.println(a);

        // create an array list
        ArrayList<String> al = new ArrayList<>();
//        List<Double> al = new ArrayList<>();
        System.out.println("Initial size of al: " + al.size());

        // add elements to the array list
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("F");
        al.add("D");
        al.add("F");

        al.add(1, "X");

        System.out.println("Size of al after additions: " + al.size());

        // display the array list
        System.out.println("Contents of al: " + al);
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + "  ");
        }
        System.out.println("");

        // Remove elements from the array list
        al.remove("F");
        al.remove(2);

        System.out.println("Size of al after deletions: " + al.size());
        System.out.println("Contents of al: " + al);
    }
}