package object_oriented_programming.polymorphism;

public abstract class Car {
    private String brand;
    private String model;
    private boolean isEngineOn ;
     int currentSpeed;

    Car(String brand , String model){
        this.brand = brand;
        this.model = model;
        this.isEngineOn = false;
        this.currentSpeed = 0;
    }

    public void startEngine(){
        isEngineOn = true;
        System.out.println("Engine Started...");
    }

    public void stopEngine(){
        isEngineOn=false;
        currentSpeed=0;
        System.out.println("Engine turned off.");
    }

    public abstract void accelerate();

    public abstract void accelerate(int speed);

    public abstract void _break();

    Car(){

    }

}
