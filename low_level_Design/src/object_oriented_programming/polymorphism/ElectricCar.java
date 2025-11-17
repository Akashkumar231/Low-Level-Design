package object_oriented_programming.polymorphism;

public class ElectricCar extends Car{

    private int batteryLevel;

    ElectricCar(String brand, String model,int batteryLevel){
        super(brand,model);
        this.batteryLevel=batteryLevel;
    }

    @Override
    public void accelerate() {
        super.currentSpeed+=5;
        this.batteryLevel-=5;
        System.out.println("Speed Increased by 5 km/hr");
    }

    public void accelerate(int speed){
        super.currentSpeed+=speed;
        this.batteryLevel-=2;
        System.out.println("Car Accelerated by 5km/hr");
    }

    @Override
    public void _break() {
        super.currentSpeed-=5;
        System.out.println("Car speed is reduced by "  + super.currentSpeed + "km/hr");
    }
}
