package soliddesignprinciples.ocp;

public class SQL_Persistence extends ShoppingCartPersistence{

    @Override
    void save(ShoppingCart_ocp shoppingCartOcp) {

        System.out.println("Saving Data to SQL Database");

    }
}
