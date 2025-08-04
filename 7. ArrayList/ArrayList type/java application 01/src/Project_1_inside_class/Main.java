package Project_1_inside_class;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cow> cows = new ArrayList<>();
        cows.add(new Cow(100,5,"AB"));
        cows.add(new Cow(100,4,"BA"));
        cows.add(new Cow(100,3,"BC"));
        cows.add(new Cow(200,2,"DA"));
        cows.add(new Cow(300,1,"AC "));

        System.out.println("Before sorting:");
        for (Cow cow:cows){
            System.out.println(cow);
        }
        //ascending order
        Collections.sort(cows);
        System.out.println("Sort by weight:");
        for (Cow cow:cows){
            System.out.println(cow);
        }
        cows.sort(Comparator.comparing(Cow::getAge));
        System.out.println("Sort by age:");
        for (Cow cow:cows){
            System.out.println(cow);
        }
        cows.sort(Comparator.comparing(Cow::getId));
        System.out.println("Sort by Id:");
        for (Cow cow:cows){
            System.out.println(cow);
        }

        //short way
        /*  cows.sort(Comparator.comparing(Cow::getWeight).thenComparing(Cow::getAge).thenComparing(Cow::getId));
        for (Cow cow:cows){
            System.out.println(cow);
        }*/

        //descending order
        Collections.sort(cows);
        System.out.println("Sort by weight:");
        for (Cow cow:cows){
            System.out.println(cow);
        }
        cows.sort(Comparator.comparing(Cow::getAge, Comparator.reverseOrder()));
        System.out.println("Sort by age:");
        for (Cow cow:cows){
            System.out.println(cow);
        }
        cows.sort(Comparator.comparing(Cow::getId, Comparator.reverseOrder()));
        System.out.println("Sort by Id:");
        for (Cow cow:cows){
            System.out.println(cow);
        }

        //short way
        /* cows.sort(Comparator.comparing(Cow::getWeight,Comparator.reverseOrder()).thenComparing(Cow::getAge,Comparator.reverseOrder()).thenComparing(Cow::getId,Comparator.reverseOrder()));
        for (Cow cow:cows){
            System.out.println(cow);
        } */

    }
}