package strategy;

abstract class Talk{
    abstract void talk();
}

abstract class Walk{
    abstract void walk();
}

abstract class Fly{
    abstract void fly();
}

class NormalTalk extends  Talk{
    public void talk(){
        System.out.println("This Robot can Talk");

    }
}

class Non_Talk extends  Talk{
    public void talk(){
        System.out.println("This Robot cannot Talk");
    }
}


class NormalWalk extends Walk {
    public void walk(){
        System.out.println("This Robot can Walk");

    }
}

class Non_Walk extends  Walk{
    public void walk(){
        System.out.println("This Robot cannot Walk");
    }
}

class Normal_Fly extends Fly{

    @Override
    void fly() {
        System.out.println("This Robot can Fly");
    }
}

class Not_Fly extends Fly{

    @Override
    void fly() {
        System.out.println("This Robot cannot Fly");
    }
}

class Robot{
    Talk talk;
    Walk walk;
    Fly fly;

    Robot(Talk talk, Walk walk , Fly fly){
        this.talk = talk;
        this.walk = walk;
        this.fly = fly;
    }

    public void projection(){
        System.out.println("This looks like a Robot.");
    }
    public void talk(){
        talk.talk();
    }
    public void walk(){
        walk.walk();
    }
    public void fly(){
        fly.fly();
    }
}

class Companion extends Robot{

    Companion(Talk talk, Walk walk, Fly fly) {
        super(talk, walk, fly);
    }


}


public class StrategyDesignPattern {

     public static void main(String [] args){
         Talk talk = new Non_Talk();
         Walk walk = new Non_Walk();
         Fly fly = new Not_Fly();
         Robot robot = new Companion(talk,walk,fly);
         robot.talk();;
         robot.walk();
         robot.fly();


     }

}
