class Engine{
    int standardType;
    int rmp;
    public Engine(int standardType, int rmp){
        this.standardType = standardType;
        this.rmp = rmp;
    }
}
class Car{
    String compnayName;
    String noPlate;
    int model;
    int maxSpeed;
    Engine eng = new Engine(1, 1000);
    public Car(String compnayName, String noPlate, int model, int maxSpeed){
        this.compnayName = compnayName;
        this.noPlate = noPlate;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    public void start(){
        System.out.println("Car is started");
    }
    public void stop(){
        System.out.println("Car is stopped");
    }
    public void display(){
        System.out.println("Car Details: " + compnayName + " " + noPlate + " " + model + " " + maxSpeed);
    }
    public void displayEngineDetails(){
        System.out.println("Engine Details: " + eng.standardType + " " + eng.rmp);
    }
}
class HasARelationship{
    public static void main(String[] args) {
        Car car = new Car("Maruti", "MH1234", 2020, 200);
        car.start();
        car.display();
        car.displayEngineDetails();
    }
}