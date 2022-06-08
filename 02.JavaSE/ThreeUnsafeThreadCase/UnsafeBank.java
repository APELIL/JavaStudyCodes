package ThreeUnsafeThreadCase;

import java.util.Calendar;

public class UnsafeBank {
    public static void main(String[] args) {
        Account couple = new Account("our money", 100);
        withdraw boy = new withdraw(couple,50, "Ape");
        withdraw girl = new withdraw(couple,100,"Yan");
        boy.start();
        girl.start();
    }
}
class Account{
    String name;
    int balance;
    public Account(String name, int balance){
        this.name = name;
        this.balance = balance;
    }
}
class withdraw extends Thread{
    Account account;
    int moneyToWith;
    int money;
    String name;
    public withdraw(Account account, int moneyToWith, String name){
        super(name);
        this.account = account;
        this.moneyToWith = moneyToWith;
        this.money = money;
    }
    @Override
    public void run() {
        //synchronized block
        synchronized (account){
            if (account.balance - moneyToWith <0){
                System.out.println(Thread.currentThread().getName()+" want to withdraw "+ moneyToWith+"$ but insufficient balance for the current account");
//                System.out.println("Insufficient balance");
                return;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.balance = account.balance - moneyToWith;
            money = money + moneyToWith;
            System.out.println(Thread.currentThread().getName()+" withdraw "+moneyToWith);
            System.out.println("Balance:"+account.balance);
            System.out.println(this.getName()+ " has "+ money);
        }
    }
}
