package Thread;

public class TestYield {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        new Thread(thread,"A").start();
        new Thread(thread,"B").start();
    }
}

class TestThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" run");
//        Thread.yield();
        System.out.println(Thread.currentThread().getName()+" stop");
    }
}
