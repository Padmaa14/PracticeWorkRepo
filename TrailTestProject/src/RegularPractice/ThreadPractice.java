package RegularPractice;

public class ThreadPractice {
    public static void main(String ar[]) {
        Tests t=new Tests();
        Thread t1=new Thread(t);
        t1.start();
        t1.run();
        for(int i=0;i<500;i++){
            System.out.println("I am main thread");
        }

    }

}

class Tests implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<500;i++){
            System.out.println("I am user created thread");
        }

    }
}
