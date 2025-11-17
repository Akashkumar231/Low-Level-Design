package object_oriented_programming.polymorphism;

public class ManualCar extends Car{


    private int dieselLevel;

    ManualCar(String brand, String model,int dieselLevel){
        super(brand,model);
        this.dieselLevel=dieselLevel;
    }

    @Override
    public void accelerate() {
        super.currentSpeed+=5;
        this.dieselLevel-=5;
        System.out.println("Speed Increased by 5 km/hr");
    }

    public void accelerate(int speed){
        super.currentSpeed+=speed;
        this.dieselLevel-=2;
        System.out.println("Car Accelerated by 5km/hr");
    }

    @Override
    public void _break() {
        super.currentSpeed-=5;
        System.out.println("Car speed is reduced by "  + super.currentSpeed + "km/hr");
    }
}
