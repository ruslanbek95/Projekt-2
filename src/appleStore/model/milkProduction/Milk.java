package appleStore.model.milkProduction;

import appleStore.model.Product;

import java.time.LocalDate;

public class Milk extends Product {
    public Milk (int id,String productName,String companyName, LocalDate localDate){
        super(id,productName,companyName, localDate);
    }

}
