package object_oriented_programming.inheritance;

public class InheritanceDemo {

    public static void main(String [] args){

        Animal animal = new Animal();
        animal.eat();
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        Human human = new Human();
        human.eat();
        human.speak();
    }

}
