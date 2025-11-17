package soliddesignprinciples.srp;

import java.util.ArrayList;
import java.util.List;

public class SRP_followed {

    public static void main(String [] args){
        Product1 Laptop = new Product1("Acer", 500000);
        Product1 Headphones = new Product1("Boat" , 1200);

        List<Product1> product1List = new ArrayList<>();
        product1List.add(Laptop);
        product1List.add(Headphones);

        ShoppingCart shoppingCart = new ShoppingCart(product1List);

        shoppingCart.calculateTotalPrice();

        DB db = new DB(shoppingCart);
        PrintInvoice printInvoice = new PrintInvoice(shoppingCart);

        db.saveToDB();
        printInvoice.printInvoice();
    }

}

class ShoppingCart{

    List<Product1> productList ;

    ShoppingCart(List<Product1> productList){
        this.productList=productList;
    }

    public List<Product1> getProductList() {
        return productList;
    }

    public void setProductList(List<Product1> productList) {
        this.productList = productList;
    }

    public void addProduct(Product1 product){
        System.out.println(product.getName()+ "Added to Cart");
        productList.add(product);
    }

    public int calculateTotalPrice(){
        int total = 0;
        for (Product1 product: productList){
            total+=product.getPrice();
        }
        return total;
    }
}

class DB{

    ShoppingCart shoppingCart ;

    DB(ShoppingCart shoppingCart){
        this.shoppingCart = shoppingCart;
    }

    public void saveToDB(){
        System.out.println("The product is saved to DB" + shoppingCart);
    }

}

 class PrintInvoice{

    ShoppingCart shoppingCart;

    PrintInvoice(ShoppingCart shoppingCart){
        this.shoppingCart=shoppingCart;
    }

    public void printInvoice(){
        List<Product1> product1s = shoppingCart.getProductList();
        int total = 0;
        for (Product1 product1 : product1s){
            total+=product1.getPrice();
        }
        System.out.println("The total price of the cart : " + total);
    }

 }

class Product1 {

    private int price;
    private String name;

    public Product1(String name, int price) {
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

