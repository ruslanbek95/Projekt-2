package appleStore.service.serviceimpl;

import appleStore.dao.ProductDao;
import appleStore.model.Manager;
import appleStore.model.Product;
import appleStore.service.Service;

import java.time.LocalDate;
import java.util.List;

public class ServiseImpl implements Service{


private final ProductDao productDao = new ProductDao();
    @Override
    public void addProduct(List<Product> products) {
//        List<Product> products1 = products.stream().filter( p -> p.getCompanyName().equals("TOIBOS")
//        || p.getCompanyName().equals("MILKA") || p.getCompanyName().equals("NUR")).
//                filter(t -> t.getLocalDate().isAfter(LocalDate.now().plusMonths(1))).toList();
//        for (Product product : products1) {
//            productDao.getProducts().add(product);
//        }
        ///////////////////////////////////////////
        for (Product product: products) {
            String company = product.getCompanyName();
            if (company.equalsIgnoreCase("MILKA")
                    || company.equalsIgnoreCase("TOIBOSS")
                    || company.equalsIgnoreCase("NUR")) {
                if (product.getLocalDate().isAfter(LocalDate.now().plusMonths(1))) {
                    productDao.getProducts().add(product);
                }
            }
        }
    }

    @Override
    public void sortProduct(List<Product> sortProduct) {
        for (int i = 0; i < sortProduct.size(); i++) {
            if (sortProduct.get(i).getLocalDate().isAfter(LocalDate.now())) {

            }
        }
    }



    @Override
    public void getAllProducts(String userName, String password) {
        if (userName.equals(productDao.getManager().getUserName()) && password.equals(productDao.getManager().getPassword())){
            productDao.getProducts().forEach(System.out::println);
//            productDao.getDiscountProducts().forEach(System.out::println);
        }else {
            System.out.println("vy veli ne pravilnye daannye!");
        }


    }

    @Override
    public void discount(List<Product> products) {
        // Product product = new Product();
        // product = products.get(i);
        for (Product product: products){
            if (product.getLocalDate().isBefore(LocalDate.now().plusWeeks(1))
                    && product.getLocalDate().isAfter(LocalDate.now())){
                productDao.getDiscountProducts().add(product);
                System.out.println(product);
            }
        }

    }

}
