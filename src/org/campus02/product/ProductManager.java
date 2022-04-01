package org.campus02.product;

import java.io.*;
import java.util.ArrayList;

public class ProductManager {

    private ArrayList<Product> products;

    public ProductManager() {
        this.products = new ArrayList<>();
    }

    public void add(Product p) {
        products.add(p);
    }

    public void save(String path) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(path)));
        oos.writeObject(products.size());
        for (Product p : products) {
            oos.writeObject(p);
        }
        oos.writeObject(null);
        oos.flush();
        oos.close();
    }

    public void load(String path) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)));

        Product product = null;
        Integer size = (Integer) ois.readObject();

        while((product = (Product) ois.readObject()) != null){
            System.out.println("product = " + product);
        }

        ois.close();
    }
}
