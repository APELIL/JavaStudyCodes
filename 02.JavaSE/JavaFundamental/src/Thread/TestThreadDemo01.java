package Thread;

public class TestThreadDemo01 extends Thread {
    @Override
    public void run() {
//        super.run();
        for (int i = 0; i < 20; i++) {
            System.out.println("Test for multithreading+"+i);
        }
    }

    public static void main(String[] args) {
        //call start() to start threading
        TestThreadDemo01 testThreadDemo01 = new TestThreadDemo01();
        testThreadDemo01.start();

        for (int i = 0; i < 200; i++) {
            System.out.println("Main thread+"+i);
        }

    }
}