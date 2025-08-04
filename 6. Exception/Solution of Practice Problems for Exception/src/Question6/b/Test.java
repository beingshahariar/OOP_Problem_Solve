package Question6.b;

class DivbyZero extends ArithmeticException {
    public DivbyZero(String message) {
        super(message);
    }
}

class Math {
    public int divide(int a, int b) throws DivbyZero {
        if (b == 0) {
            throw new DivbyZero("The denominator cannot be zero!");
        }
        return a / b;
    }
}

public class Test {
    public static void main(String[] args) {
        Math m = new Math();
        int n = 4;
        int d = 0;

        try {
            System.out.println(m.divide(n, d));
        } catch (DivbyZero e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Complete");
        }
    }
}
