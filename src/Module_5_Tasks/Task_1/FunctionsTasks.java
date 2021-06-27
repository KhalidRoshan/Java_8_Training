package Module_5_Tasks.Task_1;

import java.util.ArrayList;
import java.util.function.Function;

public class FunctionsTasks {

    public static void main(String[] args) {

        ArrayList<Product> productsList = new ArrayList<Product>();
        productsList.add(new Product("Mac", 95000, "Laptop", "S"));
        productsList.add(new Product("Pixel", 75000, "Phone", "A"));
        productsList.add(new Product("Refrigerator", 30000, "Electronics", "B"));
        productsList.add(new Product("USB Cable", 500, "Electronics", "B"));
        productsList.add(new Product("Dongle", 50, "Electronics", "D"));
        productsList.add(new Product("Pen Drive", 100, "Storage", "C"));

        //1. Write a function to calculate the cost of all products in a given list of products.

        Function<ArrayList<Product>, Integer> costFunction = (products) -> {
            int cost = 0;
            for (Product product : products) {
                cost = cost + product.getPrice();
            }
            return cost;
        };

        int totalCost = costFunction.apply(productsList);
        System.out.println("The cost of all products in a given list of products: " + totalCost);

        //2. Write a function to calculate the cost of all products whose prices is > 1000/- in the given list of products.

        Function<ArrayList<Product>, Integer> costFunctionForAbove1000 = (products) -> {
            int cost = 0;
            for (Product product : products) {
                if (product.getPrice() > 1000) {
                    cost = cost + product.getPrice();
                }
            }
            return cost;
        };

        int totalCostForAbove1000 = costFunctionForAbove1000.apply(productsList);
        System.out.println("The cost of all products whose prices is > 1000/- in the given list of products: " + totalCostForAbove1000);

        //3. Write a function to calculate the cost of all electronic products in the given list of products.

        Function<ArrayList<Product>, Integer> costFunctionForElectronics = (products) -> {
            int cost = 0;
            for (Product product : products) {
                if (product.getCategory().equals("Electronics")) {
                    cost = cost + product.getPrice();
                }
            }
            return cost;
        };
        Integer totalCostOfElectronics = costFunctionForElectronics.apply(productsList);
        System.out.println("The cost of all electronic products in the given list of products: " + totalCostOfElectronics);

        //4. Write a function to get all the products whose price is is > 1000/- and belongs to electronic category.

        Function<ArrayList<Product>, ArrayList<Product>> functionForElectronicsAbove1000 = (products) -> {
            ArrayList<Product> result = new ArrayList<Product>();
            for (Product product : products) {
                if (product.getPrice() > 1000 && product.getCategory().equals("Electronics")) {
                    result.add(product);
                }
            }
            return result;
        };

        ArrayList<Product> electronicsAbove1000 = functionForElectronicsAbove1000.apply(productsList);
        System.out.println("The products whose price is is > 1000/- and belongs to electronic category:\n" + electronicsAbove1000);
    }
}
