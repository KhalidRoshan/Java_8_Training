package Module_4_Tasks;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ProductTests {

    public static void main(String[] args) {

        Product mac = new Product("Mac", 95000, "Laptop", "S");
        Product pixel = new Product("Pixel", 75000, "Phone", "A");
        Product usbCable = new Product("USB Cable", 500, "Electronics", "B");
        Product dongle = new Product("Dongle", 50, "Electronics", "D");
        Product penDrive = new Product("Pen Drive", 100, "Storage", "C");

        ArrayList<Product> productList = new ArrayList<Product>();
        productList.add(mac);
        productList.add(pixel);
        productList.add(usbCable);
        productList.add(dongle);
        productList.add(penDrive);

        Predicate<Product> productsAbove1000 = i -> {
            return i.price > 1000;
        };

        Predicate<Product> electronicProducts = i -> {
            return i.category.equals("Electronics");
        };

        Predicate<Product> ProductsAbove100 = i -> {
            return i.price > 100;
        };

        Predicate<Product> ProductsUnder100 = i -> {
            return i.price < 100;
        };

        //1. Print all the products from the given list of the products if the price is greater than 1000/-.

        System.out.println("------------------------");

        fetchProductByPrice(productsAbove1000, productList);

        //2. Print all the products from the given list of the products if the product is of electronics category.

        System.out.println("------------------------");

        fetchProductByCategory(electronicProducts, productList);

        //3. Print all the products from the given list of product if the product price is greater than 100/- which are in electronics category.

        System.out.println("------------------------");

        fetchProductByCategoryAndPrice(electronicProducts, ProductsAbove100, productList);

        //4. Print all the products from the given list of product if the product price is greater than 100/- or product is in electronics category.

        System.out.println("------------------------");

        fetchProductByPrice(ProductsAbove100.or(electronicProducts), productList);

        //5. Print all the products from the given list of product if the product price is less than 100/- and product is in electronics category.

        System.out.println("------------------------");

        fetchProductByPrice(ProductsUnder100.and(electronicProducts), productList);

    }

    public static void fetchProductByPrice(Predicate<Product> pricePredicate, ArrayList<Product> productList) {
        for (Product product : productList)
            if (pricePredicate.test(product)) {
                System.out.println("Product: " + product.getName() + " | Price: " + product.getPrice() + " | Category: " + product.getCategory());
            }
    }

    public static void fetchProductByCategory(Predicate<Product> categoryPredicate, ArrayList<Product> productList) {
        for (Product product : productList)
            if (categoryPredicate.test(product)) {
                System.out.println("Product: " + product.getName() + " | Category: " + product.getCategory());
            }
    }

    public static void fetchProductByCategoryAndPrice(Predicate<Product> pricePredicate, Predicate<Product> categoryPredicate,
                                                      ArrayList<Product> productList) {
        ArrayList<Product> resultList = new ArrayList<Product>();
        for (Product product : productList)
            if (pricePredicate.test(product)) { resultList.add(product); }

        for (Product product : resultList)
            if (categoryPredicate.test(product)) { System.out.println("Product: " + product.getName() + " | Price: " + product.getPrice() + " | Category: " + product.getCategory()); }
    }
}
