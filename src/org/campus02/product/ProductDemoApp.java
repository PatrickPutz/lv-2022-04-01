package org.campus02.product;

import java.io.IOException;

public class ProductDemoApp {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Product p1 = new Product("beer", 3.00, "beverage");
        Product p2 = new Product("wine", 2.00, "beverage");
        Product p3 = new Product("apple", 1.00, "fruit");
        Product p4 = new Product("tomato", 1.00, "fruit");
        Product p5 = new Product("ham", 4.00, "meat");
        Product p6 = new Product("steak", 15.00, "meat");

        ProductManager pm = new ProductManager();
        pm.add(p1);
        pm.add(p2);
        pm.add(p3);
        pm.add(p4);
        pm.add(p5);
        pm.add(p6);

        pm.save("C:\\Studium\\temp\\output.txt");
        pm.load("C:\\Studium\\temp\\output.txt");

    }

}
