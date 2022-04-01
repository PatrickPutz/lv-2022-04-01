package org.campus02.productsolution;

import java.io.*;
import java.util.ArrayList;

public class ProductManager {

    private ArrayList<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }


    public void add(Product p) {
        products.add(p);
    }

    @Override
    public String toString() {
        return "ProductManager{" +
                "products=" + products +
                '}';
    }

        public void save(String path) throws ProductFileException {

            ObjectOutputStream oos = null;

            try {
                oos = new ObjectOutputStream(new FileOutputStream(path));
                oos.writeObject(products);
                oos.flush();
                oos.close();
            } catch (FileNotFoundException e) {
                throw new ProductFileException("Fehler beim Speichern von " + path, e);
            } catch (IOException e) {
                throw new ProductFileException("Fehler beim Speichern von " + path, e);
            }
            finally {
                try {
                    if (oos != null)
                        oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        public void load(String path) throws ProductFileException {
                ObjectInputStream ois = null;

                try {
                    ois = new ObjectInputStream(new FileInputStream(path));
                    products = (ArrayList<Product>) ois.readObject();
                    ois.close();
                } catch (FileNotFoundException e) {
                    throw new ProductFileException("Fehler beim Laden von " + path, e);
                } catch (IOException e) {
                    throw new ProductFileException("Fehler beim Laden von " + path, e);
                } catch (ClassNotFoundException e) {
                    throw new ProductFileException("Falsches Dateiformat beim Laden von " + path , e);
                } finally {
                    try {
                        if (ois != null)
                            ois.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
