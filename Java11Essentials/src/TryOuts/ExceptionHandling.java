package TryOuts;

public class ExceptionHandling {

    public static void main(String args[]) {
        System.out.println("Exception");
        ExceptionHandling exp = new ExceptionHandling();
        exp.test();
    }

    public void test() {
        System.out.println("test");
    }
}
