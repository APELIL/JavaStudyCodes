package staticProxy;

public class TestStaticProxy {
    public static void main(String[] args) {
        Customer customer = new Customer();
        WeddingCompany weddingCompany = new WeddingCompany(customer);
        weddingCompany.HappyMarry();
    }
}

//interface
interface Marry{
    void HappyMarry();
}
//Customer: you
class Customer implements Marry{
    @Override
    public void HappyMarry() {
        System.out.println("You're getting married");
    }
}

//Proxy: Wedding company
class WeddingCompany implements Marry{
    //Proxy target
    private Marry target;
    //Constructor
    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        beforeMarry();
        this.target.HappyMarry();
    }

    private void beforeMarry() {
        System.out.println("Wedding company is planning the wedding for you");
    }
}
