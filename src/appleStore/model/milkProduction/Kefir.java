package appleStore.model.milkProduction;

import appleStore.model.Product;

import java.time.LocalDate;

public class Kefir extends Product {
    public Kefir(int id, String productName, String CompanyName, LocalDate localDate ){
        super(id,productName,CompanyName,localDate);
    }
}
