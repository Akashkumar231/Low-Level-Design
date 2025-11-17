package soliddesignprinciples.srp;

import java.util.ArrayList;
import java.util.List;

public class SRP_violated {

    public static void main(String [] args){

        Product Mobile = new Product("Samsung", 20000);
        Product charger = new Product("Type-c",5000);

        List<Product> productList = new ArrayList<>();
        productList.add(Mobile);
        productList.add(charger);

        Shopping_Cart cart = new Shopping_Cart(productList);

        cart.addProduct(Mobile);
        cart.addProduct(charger);

        cart.printInvoice();
        cart.saveToDB();

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


class Shopping_Cart{

    private List<Product> productList;

    Shopping_Cart(List<Product> productList){
        this.productList=productList;
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

    public void printInvoice(){
        int total = 0;
        for (Product product : productList){
            total+=product.getPrice();
        }
        System.out.println("The total amount to be paid is " + total);
    }

    public void saveToDB(){
        System.out.println("Product is Saved to Database.");
    }
}
