abstract class Vehicle{
    int noOfTyers;
    int mileage;
    String brand;
    String model;
    Vehicle(int noOfTyers, int mileage, String brand, String model){
        this.noOfTyers=noOfTyers;
        this.mileage=mileage;
        this.brand=brand;
        this.model=model;
    }
    abstract void start(); 
    abstract void stop(){
        System.out.println("Bike Stopping...");
    }
    abstract void brake();
}
class Car extends Vehicle{
    Car(int noOfTyers, int mileage, String brand, String model){
        super(noOfTyers,mileage,brand,model);
    }
    void start(){
        System.out.println("Car Starting...");
    }
    super.stop();
    void brake(){
        System.out.println("Applying brakes on Car");
    }
}
class Bike extends Vehicle{
        Bike(int noOfTyers, int mileage, String brand, String model){
        super(noOfTyers,mileage,brand,model);
    }
    void start(){
        System.out.println("Bike Starting...");
    }
    super.stop();
    void brake(){
        System.out.println("Applying brakes on Bike");
    }
}
class Abstraction{
    public static void main(String[] args){
        Vehicle v1 = new Car(4, 65, "TATA", "Harrier");
        v1.start();
        v1.brake();
        v1.stop();
    }
}