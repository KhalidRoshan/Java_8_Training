package Module_6_Tasks;

import java.util.HashMap;
import java.util.Set;
import java.util.function.BiFunction;

public class BiFunctionTask {

    public static void main(String[] args) {

        //1. Given the name and price of the product, write a Bifunction to create a product.

        BiFunction<String, Integer, Product> newProduct = (name, price) -> {
            System.out.println("Added new product: " + name);
            return new Product(name, price);
        };

        Product usbCable = newProduct.apply("USB Cable", 500);
        Product dongle = newProduct.apply("Dongle", 50);
        Product penDrive = newProduct.apply("Pen Drive", 100);

        /* 2. Given the Product and quantity of the products, write a Bi-Function to calculate the cost of products.
         A cart is a map of product and quantity. Given the cart, calculate the cost of the cart. */

        BiFunction<HashMap<Product, Integer>, Integer, Integer> calculateCartValue = (productCart, sum) -> {
            sum = 0;
            Set<Product> keySet = productCart.keySet();
            for (Product productName : keySet) {
                int quantity = productCart.get(productName).intValue();
                int price = productName.getPrice();
                sum = sum + price * quantity;
            }
            return sum;
        };

        HashMap<Product, Integer> cart = new HashMap<Product, Integer>();
        cart.put(usbCable, 5);
        cart.put(dongle, 9);
        cart.put(penDrive, 2);

        Integer cartValue = calculateCartValue.apply(cart,0);
        System.out.println("-------------------------");
        System.out.println("Total cart value: " + cartValue);
    }
}
