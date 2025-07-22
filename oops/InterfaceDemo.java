interface Payment{
    int MAX_TRANSACTION = 100000;
    default void processing(){
        System.out.println("Payment processing...");
    }
    void pay();
}
class NetBanking implements Payment{
    int amount;
    public void processing(){
        System.out.println("Payment processing...");
    }
    public void pay(){
        System.out.println("Payment using NetBanking");
    }
}
class UPI implements Payment{
    int amount;
    public void processing(){
        System.out.println("Payment processing...");
    }
    public void pay(){
        System.out.println("Payment using UPI");
    }
}
class InterfaceDemo{
    public static void main(String[] args){
        NetBanking n1 = new NetBanking();
        UPI u1 = new UPI();
        n1.processing();
        u1.processing();
        n1.pay();
        u1.pay();
    }
}