public class TestExceptionThrows {
    public static void throwException() throws Exception{
        throw new Exception();
    }
    public static void throwSystemException() throws InterruptedException {
        Thread.sleep(100);
    }

    public static void main(String[] args) throws Exception {
        throwException();
        throwSystemException();
    }
}
