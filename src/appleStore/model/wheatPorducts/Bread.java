package appleStore.model.wheatPorducts;

import appleStore.model.Product;

import java.time.LocalDate;

public class Bread extends Product {



    public Bread(int id, String productName, String companyName, LocalDate localDate) {
        super(id, productName, companyName, localDate);
    }
}

