package Project_3_main_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cow> cows = new ArrayList<>();
        cows.add(new Cow(100,5, "AB"));
        cows.add(new Cow(10, 4, "BA"));
        cows.add(new Cow(100,5, "BC"));
        cows.add(new Cow(20, 2, "DA"));
        cows.add(new Cow(100,1, "AC "));

        cows.add(1,new Cow(5,1,"DF"));
        cows.set(2,new Cow(250,6,"DF"));

        //cows.remove(1);

        for (Cow cow : cows) {
            System.out.println(cow);
        }

        System.out.println("Sort:");

        Collections.sort(cows, new Comparator<Cow>() {
            @Override
            public int compare(Cow self, Cow other) {
                if (self.getWeight() > other.getWeight()) {
                    return 1;
                } else if (self.getWeight() < other.getWeight()) {
                    return -1;
                } else {
                    if (self.getAge() > other.getAge()) return 1;
                    else if (self.getAge() < other.getAge()) return -1;
                    else {
                        return self.getID().compareTo(other.getID());
                    }
                }
            }
        }
        );
        for (Cow cow : cows) {
            System.out.println(cow);

        }
        //ascending order
        System.out.println("\nCow with the lowest weight: " + cows.get(0));
        System.out.println("Cow with the highest weight: " + cows.get(cows.size() - 1));
    }
}
