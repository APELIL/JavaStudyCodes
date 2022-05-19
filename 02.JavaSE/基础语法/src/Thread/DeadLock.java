package Thread;

public class DeadLock {
    public static void main(String[] args) {
        play boy1 = new play("Mike", 0);
        play boy2 = new play("James", 1);
        boy1.start();
        boy2.start();
    }
}

//1.Toy 1
class Toy1{}
//2.Toy 2
class Toy2{}

//play
class play extends Thread {
    //simulate only one resource is available by using static
    static Toy1 t1 = new Toy1();
    static Toy2 t2 = new Toy2();

    int choice;
    String name;

    public play(String name, int choice) {
        this.name = name;
        this.choice = choice;
    }

    @Override
    public void run() {
//        super.run();
        try {
            PlayTogether();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void PlayTogether() throws InterruptedException {
        if (choice == 0) {
            synchronized (t1) { //lock t1
                System.out.println(this.name + " play toy1");
                Thread.sleep(1000);

            }
            synchronized (t2) { // boy 1 want to get lock t2
                System.out.println(this.name + " want to play toy2");
            }
        } else {
            synchronized (t2) { //lock t2
                System.out.println(this.name + " play toy2");
                Thread.sleep(2000);

            }
            synchronized (t1) { // boy 2 want to get lock t1
                System.out.println(this.name + " want to play toy1");
            }
        }
    }
}
