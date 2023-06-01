package appleStore.model;

import java.time.LocalDate;

public abstract class  Product {
   private int id;
   private String productName;
   private String CompanyName;
   private LocalDate localDate;


   public Product() {
   }

   public Product(int id, String productName, String companyName, LocalDate localDate) {
      this.id = id;
      this.productName = productName;
      CompanyName = companyName;
      this.localDate = localDate;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getProductName() {
      return productName;
   }

   public void setProductName(String productName) {
      this.productName = productName;
   }

   public String getCompanyName() {
      return CompanyName;
   }

   public void setCompanyName(String companyName) {
      CompanyName = companyName;
   }

   public LocalDate getLocalDate() {
      return localDate;
   }

   public void setLocalDate(LocalDate localDate) {
      this.localDate = localDate;
   }

   @Override
   public String toString() {
      return "Product{" +
              "id=" + id +
              ", productName='" + productName + '\'' +
              ", CompanyName='" + CompanyName + '\'' +
              ", localDate=" + localDate +
              '}';
   }
}