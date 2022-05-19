package Thread;

public class TestYield2 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" run");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+" stop");
    }

    public static void main(String[] args) {
        TestYield2 testYield2 = new TestYield2();
        new Thread(testYield2,"A").start();
        new Thread(testYield2,"B").start();
    }
}
