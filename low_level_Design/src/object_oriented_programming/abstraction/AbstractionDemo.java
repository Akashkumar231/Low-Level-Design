package object_oriented_programming.abstraction;

//Encapsulation Demo
public class AbstractionDemo {

    public static void main(String [] args){


       Car car = new Car("Mahindra","Scorpio N", "150","25LPA");
        System.out.println(car.getName() + " " +
                           car.getModel() + " " +
                           car.getPrice() + " " +
                           car.getTopSpeed());

        car.start();
        car.shiftGear();
        car.accelerate(5);
        car.start();
        car.stop();
    }

}
