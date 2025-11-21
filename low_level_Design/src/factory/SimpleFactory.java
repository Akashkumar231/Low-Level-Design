package factory;

abstract class Burger{
    public abstract void  prepareBurger();
}

class BasicBurger extends Burger{
    public void prepareBurger(){
        System.out.println("Preparing Basic Burger");
    }
}

class PremiumBurger extends Burger{
    public void prepareBurger(){
        System.out.println("Preparing Premium Burger.");
    }
}

class GarlicBurger extends Burger{
    public void prepareBurger(){
        System.out.println("Preparing Garlic Burger.");
    }
}

class BurgerFactory {

    public Burger createBurger(String burgerType){
        if (burgerType.equalsIgnoreCase("basicburger")){
            return new BasicBurger();
        }else if (burgerType.equalsIgnoreCase("premiumburger")){
            return new PremiumBurger();
        }
       return new GarlicBurger();
    }

}

public class SimpleFactory {

    public static void main(String[] args) {

        String type = "basicburger";
        BurgerFactory bgFactory = new BurgerFactory();
        Burger burger = bgFactory.createBurger(type);
        burger.prepareBurger();

    }

}
