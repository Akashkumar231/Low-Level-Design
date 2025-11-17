package object_oriented_programming.polymorphism;

public class Main {

    public static void main(String [] args){
        Car electricCar = new ElectricCar("OLA","Scooty",150);
        Car manualCar = new ManualCar("Mahindra" , "Thar",60);
        electricCar.startEngine();
        electricCar.accelerate();
        electricCar.accelerate(2);
        electricCar._break();
        electricCar.stopEngine();

        System.out.println("******************----------------------------***************");
        manualCar.startEngine();
        manualCar.accelerate();
        manualCar.accelerate(5);
        manualCar._break();
        manualCar.stopEngine();
    }

}
