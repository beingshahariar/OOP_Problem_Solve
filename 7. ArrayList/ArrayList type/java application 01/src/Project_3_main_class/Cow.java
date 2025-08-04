package Project_3_main_class;

public class Cow {
    private double weight;
    private int age;
    private String ID;

    public Cow(double weight, int age, String ID) {
        this.weight = weight;
        this.age = age;
        this.ID = ID;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getID() {
        return ID;
    }

    public String toString() {
        return "Weight: " + weight + ", Age: " + age + ", ID: " + ID;
    }
}
