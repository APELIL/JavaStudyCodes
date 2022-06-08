package Thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSystemTime {
    public static void main(String[] args) {
        try {
            getTime();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void getTime() throws InterruptedException {
        Date startTime = new Date(System.currentTimeMillis());
        while(true){
        System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));
        startTime = new Date(System.currentTimeMillis());
        Thread.sleep(1000);}
    }
}
