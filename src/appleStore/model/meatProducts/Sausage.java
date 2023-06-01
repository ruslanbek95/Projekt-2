package appleStore.model.meatProducts;

import appleStore.model.Product;

import java.time.LocalDate;

public class Sausage extends Product {


    public Sausage(int id, String productName, String companyName, LocalDate localDate) {
        super(id, productName, companyName, localDate);
    }
}
