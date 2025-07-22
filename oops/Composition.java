class Engine{
    String type;
    int strokes;
    Engine(String type, int strokes){
        this.type=type;
        this.strokes=strokes;
    }
    void printDetails(){
        System.out.println("---- Engine Details ----");
        System.out.println("Engine Type: " + type + ", Strokes: " + strokes);
    }
}
class Car{
    String type;
    String carClass;
    int modelYear;
    int mileage;
    int strokes;
    Engine engine;
    Car(String type, String carClass, int modelYear, int mileage, int strokes){
        this.type=type;
        this.carClass=carClass;
        this.modelYear=modelYear;
        this.mileage=mileage;
        this.strokes=strokes;
        this.engine= new Engine(type, strokes);
    }
    void printDetails() {
        System.out.println("\n--- Composition: Car Details ---");
        System.out.println("Type: " + type + ", Class: " + carClass +
                           ", Model Year: " + modelYear + ", Mileage: " + mileage);
        engine.printDetails(); // tightly coupled
    }
}
class Composition{
    public static void main(String args[]){
        Car c = new Car("Electric","Luxury",2023,40,6);
        c.printDetails();
    }
}