package RegularPractice;

public class ExceptionHandlingParent {
    public int method(int a, int b) {
        return 0;
    }

    public static void main(String arg[]) {
        System.out.println(test(0));
        System.out.println(test(1));
    }

    public static int test(int i) {
        try {
            if (i == 0)
                throw new Exception();
            return 0;
        } catch (Exception e) {
            return 1;
        } finally {
            return 2;
        }
    }
}

class Child extends ExceptionHandlingParent {
    @Override
    public int method(int a, int b) {
        a++;
        b++;
        return super.method(a, b);
    }
}
