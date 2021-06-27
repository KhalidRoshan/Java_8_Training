package Module_5_Tasks.Task_2;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerSupplierTask {
    public static void main(String[] args) {

        Random rnd = new Random();

        ArrayList<Product> productsList = new ArrayList<Product>();
        productsList.add(new Product("Mac", 95000, "Laptop", "S"));
        productsList.add(new Product("Pixel", 75000, "Phone", "S"));
        productsList.add(new Product("Refrigerator", 30000, "Electronics", "A"));
        productsList.add(new Product("USB Cable", 1200, "Electronics", "B"));
        productsList.add(new Product("Dongle", 50, "Electronics", "D"));
        productsList.add(new Product("Pen Drive", 100, "Storage", "C"));

        //1. Given a product write a consumer to print the product to appropriate medium depending on the print parameter.

        Consumer<ArrayList<Product>> printProducts = (productList) -> {
            for(Product product : productList)
                System.out.println("Product: " + product.getName() + " | Price: " + product.getPrice() + " | Grade: " + product.getGrade());
        };

        printProducts.accept(productsList);

        //2.  Write a Consumer to update the grade of the product as 'Premium' if the price is > 1000/-.

        Consumer<ArrayList<Product>> updatePremium = (productList) -> {
            for(Product product : productList)
                if (product.getPrice() > 1000){
                    product.setGrade("Premium");
                }
        };

        updatePremium.accept(productsList);
        System.out.println("--------------------------");
        printProducts.accept(productsList);

        //3. Write a Consumer to update the name of the product to be suffixed with '*' if the price of product is > 3000/-.

        Consumer<ArrayList<Product>> addAsteriskForAbove3000 = (productList) -> {
            for(Product product : productList)
                if (product.getPrice() > 3000){
                    product.setName(product.getName()+"*");
                }
        };

        addAsteriskForAbove3000.accept(productsList);
        System.out.println("--------------------------");
        printProducts.accept(productsList);

        //4.  Print all the Premium grade products with name suffixed with '*'.

        Consumer<ArrayList<Product>> printPremiumProductsWithAsterisk = (productList) -> {
            for(Product product : productList)
                if (product.getName().contains("*") && product.getGrade().equals("Premium")){
                    System.out.println("Product: " + product.getName() + " | Price: " + product.getPrice() + " | Grade: " + product.getGrade());
                }
        };

        System.out.println("--------------------------");
        printPremiumProductsWithAsterisk.accept(productsList);

        //1. Write a supplier to produce a random product.

        System.out.println("--------------------------");
        Supplier<Product> randomProductSupplier = () -> {
            return new Product("Random Product " +rnd.nextInt(1000), rnd.nextInt(1000));
        };

        System.out.println(randomProductSupplier.get());

        //2. Write a supplier to produce a random OTP.

        Supplier<String> randomSup = () -> {
            return String.valueOf(rnd.nextInt(999999));
        };

        System.out.println("--------------------------");
        System.out.println("Random OTP: " + randomSup.get());

    }

}
