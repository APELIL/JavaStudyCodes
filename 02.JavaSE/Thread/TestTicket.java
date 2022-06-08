package Thread;

public class TestTicket implements Runnable {
    @Override
    public void run() {
        int ticketNum = 10;
        while (true){
            if (ticketNum <= 0) {
                break;
            }
            System.out.println(Thread.currentThread().getName()+"get+"+ticketNum--+"ticket");
        }
    }

    public static void main(String[] args) {
        TestTicket testTicket = new TestTicket();
        new Thread(testTicket,"MIKE").start();
        new Thread(testTicket,"LEO").start();
        new Thread(testTicket,"Jack").start();
        //this will lead to
    }
}
