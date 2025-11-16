package object_oriented_programming.abstraction;
// Encapsulation.

public class Car {
    // properties
    private String name;
    private String model;
    private String topSpeed;
    private String price;
    private boolean start = false;
    private int accelerate;
    private int gear;
    private int slowDown;
    private int speed;

    // Constructor
    Car(String name , String model , String speed, String price){
        this.name = name;
        this.model = model;
        this.topSpeed = speed;
        this.price = price;
    }

    // Behaviours
    public void start(){

        if (this.start){
            System.out.println("The car is already started.");
        }
         else{
            System.out.println("Starting Car.");
            this.start = true;
        }

    }

    public void accelerate(int speed){
        this.speed=speed;
        System.out.println("Speed up with : " + speed + "km/hr" );
    }

    public void shiftGear(){

        if (this.gear== 5){
            System.out.println("Cannot Shift Gear.");
        }else {
            this.gear +=1;
            System.out.println("Shifted Gear.");
        }

    }

    public void stop(){
        if (!this.start){
            System.out.println("The car is already stopped");
        }else{
            System.out.println("Engine is off");
            this.start = false;
        }
    }

    public void slowDown(int speed){
        if (this.speed == 0){
            System.out.println("Car is Stopped");
        }else{
            this.speed-=5;
            System.out.println("Slow Down with " +  speed + "km/hr");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(String speed) {
        this.topSpeed = speed;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
