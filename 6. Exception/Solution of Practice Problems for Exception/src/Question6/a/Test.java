package Question6.a;

class Math{
    public int divide(int a, int b){
        return a/b;
    }
}

public class Test {
    public static void main(String[] args) {
        Math m = new Math();
        int n = 4;
        int d = 0;

        try {
            System.out.println(m.divide(n, d));
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        } finally {
            System.out.println("Complete");
        }
    }
}
