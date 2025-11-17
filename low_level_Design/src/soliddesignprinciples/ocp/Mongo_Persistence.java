package soliddesignprinciples.ocp;

public class Mongo_Persistence extends ShoppingCartPersistence{


    @Override
    void save(ShoppingCart_ocp shoppingCartOcp) {
        System.out.println("Saving to Mongo_Db Database");
    }
    
}
