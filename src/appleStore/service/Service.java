package appleStore.service;

import appleStore.model.Product;

import java.util.List;

public interface Service {
void addProduct(List<Product>products);
void  sortProduct(List<Product>sortProduct);
void getAllProducts(String userName,String password);

void discount(List<Product> products);



}
