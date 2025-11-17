package soliddesignprinciples.ocp;

import java.util.ArrayList;
import java.util.List;

public class OCP_followed {
    public static void main(String [] args){

        ShoppingCartPersistence mongo = new Mongo_Persistence();
        ShoppingCartPersistence sql = new SQL_Persistence();

        Product Laptop = new Product("Acer", 500000);
        Product Headphones = new Product("Boat" , 1200);

        List<Product> product1List = new ArrayList<>();
        product1List.add(Laptop);
        product1List.add(Headphones);

        ShoppingCart_ocp shoppingCart = new ShoppingCart_ocp(product1List);

        System.out.println(shoppingCart.calculateTotalPrice()); ;


        PrintInvoice printInvoice = new PrintInvoice(shoppingCart);

        sql.save(shoppingCart);
        mongo.save(shoppingCart);

        printInvoice.printInvoice();
    }
}
