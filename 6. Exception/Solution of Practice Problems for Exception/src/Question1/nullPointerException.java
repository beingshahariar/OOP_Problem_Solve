package Question1;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printAge() {
        System.out.println("Age: " + age);
    }
}

public class nullPointerException {
    public static void main(String[] args) {
        Person person = null; // Creating a Person object without initializing it

        try {
            person.printAge(); // Calling printAge method on the null object will result in NullPointerException
        } catch (NullPointerException e) {
            System.err.println("The person object is not initialized. ");
        }
    }
}
