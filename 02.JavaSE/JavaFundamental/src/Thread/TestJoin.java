package Thread;

public class TestJoin {
    public static void main(String[] args) throws InterruptedException {
        Tj tj = new Tj();
        Thread thread = new Thread(tj);
        thread.start();
        for (int i = 0; i < 500; i++) {
            if (i==200){
                thread.join();
            }
            System.out.println("Main thread run"+i);
        }
    }
}
class Tj implements Runnable{
    @Override
    public void run() {
//        int i1 = 0;
        for (int i1 = 0; i1 < 200; i1++) {
            System.out.println("VIP Thread run"+i1);
        }
    }
}
