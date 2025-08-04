package Project_2_outside_new_class;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cow> cows = new ArrayList<>();
        cows.add(new Cow(100, 5, "AB"));
        cows.add(new Cow(100, 4, "BA"));
        cows.add(new Cow(100, 2, "BC"));
        cows.add(new Cow(200, 2, "DA"));
        cows.add(new Cow(300, 1, "AC"));

        Collections.sort(cows, new sortbyweight());
        System.out.println(cows);

        Collections.sort(cows, new sortbyageid());
        System.out.println(cows);

    }
}