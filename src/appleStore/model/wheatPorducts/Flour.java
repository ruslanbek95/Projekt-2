package appleStore.model.wheatPorducts;

import appleStore.model.Product;

import java.time.LocalDate;

public class Flour extends Product {



    public Flour(int id, String productName, String companyName, LocalDate localDate) {
        super(id, productName, companyName, localDate);
    }
}

