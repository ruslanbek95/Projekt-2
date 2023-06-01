package appleStore.dao;

import appleStore.model.Manager;
import appleStore.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    private static List<Product> products = new ArrayList<>();
    private static List<Product> discountProducts= new ArrayList<>();
    private  Manager manager= new Manager("Ruslan","123");

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getDiscountProducts() {
        return discountProducts;
    }

    public void setDiscountProducts(List<Product> discountProducts) {
        this.discountProducts = discountProducts;
    }

    public Manager getManager() {
        return manager;
    }

    @Override
    public String toString() {
        return "ProductDao{" +
                "products=" + products +
                ", discountProducts=" + discountProducts +
                ", manager=" + manager +
                '}';
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}

