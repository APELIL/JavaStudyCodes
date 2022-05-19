package ThreeUnsafeThreadCase;

public class ButTicket {

    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();
        new Thread(buyTicket, "A").start();
        new Thread(buyTicket, "B").start();
        new Thread(buyTicket, "C").start();
    }
}
class BuyTicket implements Runnable{
    boolean flag = true;
    int numT = 10;
    @Override
    public void run() {
        while(flag){
            buy();
        }
    }
    private synchronized void buy(){
        if (numT<=0){
            flag = false;
            return;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" get ticket "+numT--);
        }
    }

