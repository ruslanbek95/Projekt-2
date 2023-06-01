import appleStore.model.Product;
import appleStore.model.meatProducts.Meat;
import appleStore.model.meatProducts.Sausage;
import appleStore.model.meatProducts.fish;
import appleStore.model.milkProduction.Kefir;
import appleStore.model.milkProduction.Milk;
import appleStore.model.milkProduction.Yougurt;
import appleStore.model.wheatPorducts.Bread;
import appleStore.model.wheatPorducts.Flour;
import appleStore.model.wheatPorducts.Pasta;
import appleStore.service.Service;
import appleStore.service.serviceimpl.ServiseImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Product>products=new ArrayList<>();
        products.add(new Kefir(1,"AIRAN","MILKA",LocalDate.of(2023,5,1)));
        products.add(new Milk(2,"SYT", "ATA",LocalDate.of(2024,5,4)));
        products.add(new Yougurt(3,"AGUSHA","MILKA",LocalDate.of(2023,5,3)));


        products.add(new fish(4,"BALYK","TOIBOSS",LocalDate.of(2023,6,3)));
        products.add(new Meat(5,"BEEF","TOIBOSS",LocalDate.of(2029,5,3)));
        products.add(new Sausage(6,"TELE","LUNA",LocalDate.of(2021,5,4)));


        products.add(new Bread(7,"TELE","NUR",LocalDate.of(2023,6,3)));
        products.add(new Flour(8,"TELE","TOIBOSS",LocalDate.of(2024,5,5)));
        products.add(new Pasta(9,"egg","nur",LocalDate.of(2023,6,7)));
        Service service = new ServiseImpl();
        service.addProduct(products);
       // service.getAllProducts("Ruslan", "123");
//        service.sortProduct(products);
        service.discount(products);





    }
}