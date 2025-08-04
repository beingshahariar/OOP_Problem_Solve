public class TestException9 {

    public static void main(String[] args){
        try{
            test();
        }catch(Exception e){
            System.out.println("Catch from main: "+ e.getMessage());
        }
    }

    public static void test(){
        try{
            int c = 4/0; //system generated exception
        } catch(ArithmeticException e){
            System.out.println("Catch from test: "+ e.getMessage());
            throw new IllegalArgumentException("throwing another exception");
        } finally{
            System.out.println("Finally from test method.");
        }
        System.out.println("After Finally from test method.");
    }
}
