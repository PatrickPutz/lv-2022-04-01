package org.campus02.productsolution;

public class ProductDemoApp {
    public static void main(String[] args) {
/*
        try {
            // save entries
            ProductManager pm = new ProductManager();
            pm.add(new Product("Laptop", 1200.0,"Consumer-Goods"));
            pm.add(new Product("Golf 8", 39_512.9,"Automobile"));
            pm.add(new Product("Banana", 2.89,"Fruits"));
            pm.save("C:\\Studium\\temp\\products.dat");

            System.out.println("saved");
        } catch (ProductFileException e) {
            e.printStackTrace();
        }
*/

        try {
            // load entries
            System.out.println("loading entries ...");
            ProductManager pm = new ProductManager();
            pm.load("C:\\Studium\\temp\\products.dat");
            System.out.println(pm.toString());
        } catch (ProductFileException e) {
            e.printStackTrace();
        }

    }
}
