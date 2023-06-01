package appleStore.model.meatProducts;

import appleStore.model.Product;

import java.time.LocalDate;

public class fish extends Product {

    public fish(int id, String productName, String companyName, LocalDate localDate) {
        super(id, productName, companyName, localDate);
    }
}
