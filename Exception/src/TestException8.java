public class TestException8 {
    public static void main(String[] args){
        testSqrt(-1);
    }

    public static void testSqrt(int s){
        try{
            System.out.println(sqr(s));
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int sqr(int a) throws Exception{
        if (a < 0)
            throw new Exception("can't be less than 0");  return a*a;
    }

    public static int callSqr(int a) throws Exception{
        return sqr(a);
    }
}
