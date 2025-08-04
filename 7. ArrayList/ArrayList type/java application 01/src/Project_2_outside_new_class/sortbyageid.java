package Project_2_outside_new_class;

import java.util.Comparator;

public class sortbyageid implements Comparator<Cow> {

    public int compare(Cow self,Cow other) {
    if (self.getAge() > other.getAge()){
        return 1;
    } else if (self.getAge() < other.getAge()) {
        return -1;
    }
            else {
        return self.getId().compareTo(other.getId());
    }
 }
}
