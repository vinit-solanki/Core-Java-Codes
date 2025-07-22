class PaymentProcessor {

    // Pay using Card
    void pay(String cardNumber, double amount) {
        System.out.println("Paid ₹" + amount + " using Card: " + cardNumber);
    }

    // Pay using UPI
    void pay(String upiId) {
        System.out.println("Paid using UPI ID: " + upiId);
    }

    // Pay using Cash
    void pay(double cashAmount) {
        System.out.println("Paid ₹" + cashAmount + " in cash");
    }

    // Pay using card + CVV
    void pay(String cardNumber, int cvv, double amount) {
        System.out.println("Paid ₹" + amount + " using Card: " + cardNumber + " and CVV: " + cvv);
    }
}

class CompileTimePolymorphism{
    public static void main(String[] args){
        PaymentProcessor processor = new PaymentProcessor();
        processor.pay("1234-5678-9012", 1000.0);               // Card
        processor.pay("user@upi");                             // UPI
        processor.pay(500.0);                                  // Cash
        processor.pay("1234-5678-9012", 123, 1500.0);          // Card + CVV
    }
}