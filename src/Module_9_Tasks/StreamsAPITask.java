package Module_9_Tasks;

import Module_5_Tasks.Task_1.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAPITask {
    public static void main(String args[]){

        ArrayList<Product> productsList = new ArrayList<Product>();
        productsList.add(new Product("Mac", 95000, "Laptop", "S"));
        productsList.add(new Product("Pixel", 75000, "Phone", "A"));
        productsList.add(new Product("Refrigerator", 30000, "Electronics", "B"));
        productsList.add(new Product("USB Cable", 500, "Electronics", "B"));
        productsList.add(new Product("Dongle", 50, "Electronics", "D"));
        productsList.add(new Product("Pen Drive", 100, "Storage", "C"));

        //1. From the given list of the products get all the products with price > 1000/-

        List<Product> productsAbove1000 = productsList.stream().filter((Product) -> Product.getPrice() > 1000)
                .collect(Collectors.toList());

        System.out.println(productsAbove1000);

        //2. From the given list of the products get all the products from electronics category

        List<Product> electronicProducts = productsList.stream().filter((Product) -> Product.getCategory().equals("Electronics"))
                .collect(Collectors.toList());

        System.out.println(electronicProducts);

        /* 3. From the given list of the products get all the products with price> 1000/- and from electronics category.
         Change the name of the result list into CAP letters before printing. */

        List<String> printElectronicsAbove1000 = productsList.stream().filter((Product) -> Product.getPrice() > 1000)
                .filter((Product) -> Product.getCategory().equals("Electronics")).map((Product)->Product.getName().toUpperCase())
                .collect(Collectors.toList());

        System.out.println(printElectronicsAbove1000);

        //4. Calculate the count of all electronic products in the given list of products.

        long fetchCountOfElectronics = productsList.stream().filter((Product) -> Product.getCategory().equals("Electronics"))
                .count();

        System.out.println(fetchCountOfElectronics);
    }
}
