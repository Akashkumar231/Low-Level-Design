package soliddesignprinciples.ocp;

public abstract class ShoppingCartPersistence {

    private ShoppingCart_ocp shoppingCartOcp;

    abstract void save(ShoppingCart_ocp shoppingCartOcp);

}
