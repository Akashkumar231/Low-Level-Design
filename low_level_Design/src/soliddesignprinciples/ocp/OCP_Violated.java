package soliddesignprinciples.ocp;







import java.util.ArrayList;
import java.util.List;

public class OCP_Violated {
    public static void main(String [] args){
        Product Laptop = new Product("Acer", 500000);
        Product Headphones = new Product("Boat" , 1200);

        List<Product> product1List = new ArrayList<>();
        product1List.add(Laptop);
        product1List.add(Headphones);

        ShoppingCart_ocp shoppingCart = new ShoppingCart_ocp(product1List);

        System.out.println(shoppingCart.calculateTotalPrice()); ;

        DB db = new DB(shoppingCart);
        PrintInvoice printInvoice = new PrintInvoice(shoppingCart);

        db.saveTo_Mongo_DB();
        db.savTo_SQL_DB();
        printInvoice.printInvoice();
    }

}

class Product {

    private int price;
    private String name;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class PrintInvoice{

    ShoppingCart_ocp shoppingCart;

    PrintInvoice(ShoppingCart_ocp shoppingCart){
        this.shoppingCart=shoppingCart;
    }

    public void printInvoice(){
        List<Product> product1s = shoppingCart.getProductList();
        int total = 0;
        for (Product product1 : product1s){
            total+=product1.getPrice();
        }
        System.out.println("The total price of the cart : " + total);
    }

}
class ShoppingCart_ocp{

    List<Product> productList ;

    ShoppingCart_ocp(List<Product> productList){
        this.productList=productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product){
        System.out.println(product.getName()+ "Added to Cart");
        productList.add(product);
    }

    public int calculateTotalPrice(){
        int total = 0;
        for (Product product: productList){
            total+=product.getPrice();
        }
        return total;
    }
}


class DB{

    ShoppingCart_ocp shoppingCart ;

    DB(ShoppingCart_ocp shoppingCart){
        this.shoppingCart = shoppingCart;
    }

    public void saveTo_SQL_DB(){
        System.out.println("The product is saved to DB " + shoppingCart);
    }

    public void savTo_SQL_DB(){
        System.out.println("The product is saved to SQL " +  shoppingCart);
    }

    public void saveTo_Mongo_DB(){
        System.out.println("The product is saved to MONGO_DB " + shoppingCart );
    }

}
