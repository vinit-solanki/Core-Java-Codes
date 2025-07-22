class Car{
    String type;
    String carClass;
    int modelYear;
    int mileage;
    Engine engine; //association=> Car Has-A Engine
    Car(){
        System.out.println("Default Car Constructor");
    }
    Car(String type, String carClass, int modelYear, int mileage, Engine engine){
        this.type=type;
        this.carClass=carClass;
        this.modelYear=modelYear;
        this.mileage=mileage;
        this.engine=engine; 
    }
    void printDetails(){
        System.out.println("Car Type :"+type+" \nCar Class: "+carClass+"\nModel Year: "+modelYear+"\nMileAge: "+mileage);
        engine.printDetails();
    }
}
class Engine{
    String engineType;
    int strokes;
    Engine(){
        System.out.println("Default Engine Constructor");
    }
    Engine(String engineType, int strokes){
        this.engineType=engineType;
        this.strokes=strokes;
    }
    // Association: Engine USES Car
    void printDetails() {
        System.out.println("---- Engine Details ----");
        System.out.println("Engine Type: " + engineType + ", Strokes: " + strokes);
    }
}
class Association{
    public static void main(String args[]){
        Engine e1 = new Engine("Electric",6);
        Car c1 = new Car("Sedan", "S", 2023, 40, e1);
        c1.printDetails();
    }
}