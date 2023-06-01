package appleStore.model.milkProduction;

import appleStore.model.Product;

import java.time.LocalDate;

public class Yougurt extends Product {

    public Yougurt(int id, String productName, String companyName, LocalDate localDate) {
        super(id, productName, companyName, localDate);
    }
}
