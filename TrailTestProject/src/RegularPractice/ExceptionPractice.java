package RegularPractice;

import java.io.IOException;


public class ExceptionPractice {
    public void method() throws AssertionError {
    }

    public static void main(String ar[]) {

        try {
            int x = 0;
            x = x + 1;
            if (x == 1) {
                throw new ArithmeticException();
            }

        }catch (ArithmeticException | NullPointerException | SecurityException e){
            System.out.println(" here 1 "+e.getMessage());
        }
        catch (Exception e) {
            System.out.println(" here 3"+e.getMessage());
        }finally {
            System.out.println("ok i m finally");
        }

    }
}
