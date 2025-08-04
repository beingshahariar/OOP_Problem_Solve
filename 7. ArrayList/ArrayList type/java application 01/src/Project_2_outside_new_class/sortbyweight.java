package Project_2_outside_new_class;

import java.util.Comparator;

public class sortbyweight implements Comparator<Cow> {

    public int compare(Cow self,Cow other) {
        if (self.getWeight() > other.getWeight()) {
            return 1;
        } else if (self.getWeight() < other.getWeight()) {
            return -1;
        } else {

            return 0;

        }
    }
}
