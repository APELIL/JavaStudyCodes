package Thread;
//consumer, product, producer, container
public class TestTube {
    public static void main(String[] args) {
        container c = new container();
        new consumer(c).start();
        new producer(c).start();
    }
}

class ProductChicken{
    int id;
    public ProductChicken(int id){
        this.id = id;
    }
}

class consumer extends Thread{
    container c;
    public consumer(container c){
        this.c = c;
    }
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("consumer get "+c.pop().id+" chicken");
        }
    }
}

class producer extends Thread{
    container c;
    public producer(container c){
        this.c = c;
    }
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            c.push(new ProductChicken(i));
            System.out.println("produced "+i+" chicken");
        }
    }
}
//produce and consume chicken in this container
class container{
//    ProductChicken ChickenBox;
    ProductChicken[] ChickenBox = new ProductChicken[10];
    int serialNum = 0;
    //no chicken, need to produce
    public synchronized void push(ProductChicken chicken){
        // producer wait, notify consumer to consume
        if (serialNum == ChickenBox.length){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //no chicken available, produce chicken
        ChickenBox[serialNum] = chicken;
        serialNum++;
        //notify consumer to consume
        this.notifyAll();
    }

    //chicken are available, need to consume
    public synchronized ProductChicken pop(){
        if (serialNum==0){
            //notify consumer to wait
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //consume chicken
        serialNum--;
        ProductChicken chicken1 = ChickenBox[serialNum];
        //notify producer to produce
        this.notifyAll();
        return chicken1;
    }
}
