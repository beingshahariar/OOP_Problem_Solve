import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class TestClassComparator implements Comparator<TestClass> {

    @Override
    public int compare(TestClass o1, TestClass o2) {
        //return o1.getName().compareTo(o2.getName());
        return o1.getId() - o2.getId();
    }
}

class ComplexTestClassComparator implements Comparator<TestClass>{

    @Override
    public int compare(TestClass o1, TestClass o2) {
        return 0;
    }
}

class Person implements Comparable<Person>
{
    String name;
    int id;
    int cgpa;

    public Person(String name, int id, int cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCgpa() {
        return cgpa;
    }

    public void setCgpa(int cgpa) {
        this.cgpa = cgpa;
    }

    void printPerson(Person p)
    {
        System.out.println(p.name + " " + p.id + " " + p.cgpa);
    }

    @Override
    public int compareTo(Person o) {
        if (this.id > o.id)
            return 1;
        else if (this.id < o.id)
            return -1;
        else
            return 0;
    }
}

class cgpaComparator implements Comparator<Person>
{

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.cgpa, o2.cgpa);
    }
}
class TestClass implements Comparable<TestClass> {

    private String name;
    private int id;

    TestClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public int compareTo(TestClass o) {
        // return this.id - o.getId();
        return -1 * this.name.compareTo(o.name); // compares two strings based on unicode settings
    }
}

class ComparatorDemo {

    public static void printList(List<TestClass> al) {
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i).getId() + ", " + al.get(i).getName());
        }
        System.out.println();
    }

    public static void printPerson(List<Person> al) {
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i).getId() + ", " + al.get(i).getName() + "," + al.get(i).getCgpa());
        }
        System.out.println();
    }

    public static void main(String args[]) {
        ArrayList<TestClass> al = new ArrayList<>();

        al.add(new TestClass(1, "C"));
        al.add(new TestClass(3, "A"));
        al.add(new TestClass(2, "E"));
        al.add(new TestClass(5, "B"));
        al.add(new TestClass(4, "D"));
        al.add(new TestClass(6, "F"));

        ArrayList<Person> p = new ArrayList<>();
        p.add(new Person("a",11,2));
        p.add(new Person("d",11,3));
        p.add(new Person("c",9,4));
        p.add(new Person("b",8,3));

        printPerson(p);
        Collections.sort(p, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.id > o2.id)
                    return -1;
                else if (o1.id < o2.id)
                    return 1;
                else if (o1.cgpa > o2.cgpa)
                    return -1;
                return 0;
            }
        });
        printPerson(p);

        printPerson(p);
        Collections.sort(p);
        printPerson(p);

        Collections.sort(p, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.name.compareTo(p2.name);
            }
        });

        printPerson(p);

        Collections.sort(p, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.id - p2.id;
            }
        });

        printPerson(p);

        Collections.sort(p, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                if (p1.cgpa > p2.cgpa)
                    return 1;
                return -1;
            }
        });

        printPerson(p);

    }
}