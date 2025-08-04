package Project_2_outside_new_class;

public class Cow {
    private double weight;
    private int age;
    private String id;

    public Cow(double weight, int age, String id) {
        this.weight = weight;
        this.age = age;
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        System.out.println("Weight:" + weight + " Age:" + age + " Id:" + id);
        return "";
    }
}


