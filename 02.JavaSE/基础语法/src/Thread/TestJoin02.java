package Thread;

public class TestJoin02 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("VIP run+"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestJoin02 testJoin02 = new TestJoin02();
        Thread thread = new Thread(testJoin02);
        thread.start();

        //main thread
        for (int i = 0; i < 500; i++) {
            if (i==200){
                thread.join();
            }
            System.out.println("Main run+"+i);
        }

    }
}
