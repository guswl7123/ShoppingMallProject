package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {
   
	public static ProductRepository instance = new ProductRepository();
	
   private ArrayList<Product> listOfProducts = new ArrayList<Product>();

   public ProductRepository() {
      Product phone = new Product("P1234", "iPhone 12", 1000000);
      phone.setDescriotion("6.1-inch,2532X1170 Super Retina XDR display, 듀얼 12MP 카메라");
      phone.setCategory("Smart Phone");
      phone.setManufacturer("Apple");
      phone.setUntitsInStock(1000);
      phone.setCondition("New");
      
      Product notebook = new Product("P1235", "LG PC 그램", 1500000);
      notebook.setDescriotion("13.3-inch, IPS LED display, 5rd Generation Intel Core processors");
      notebook.setCategory("Notebook");
      notebook.setManufacturer("LG");
      notebook.setUntitsInStock(1000);
      notebook.setCondition("Refurbished");
      
      
      Product tablet = new Product("P1236", "Galaxy tab 5", 900000);
      tablet.setDescriotion("212.8*125.6*6.6mm, Super AMOLED display, Octa-Core processor");
      tablet.setCategory("Tablet");
      tablet.setManufacturer("Samsung");
      tablet.setUntitsInStock(1000);
      tablet.setCondition("Old");
      
      listOfProducts.add(phone);
      listOfProducts.add(notebook);
      listOfProducts.add(tablet);
      
   
      
   }
   
   public static ProductRepository getInstance() {
	   return instance;
   }
   
   public void addProduct(Product product) {
	   listOfProducts.add(product);
   }
   
   
   public ArrayList<Product> getAllProducts(){
      return listOfProducts;
   }
   
   public Product getProductById(String productId) {
      Product productById = null;
      
      for(int i=0; i<listOfProducts.size(); i++) {
         Product product = listOfProducts.get(i);
         if(product != null && product.getProductId()!= null && product.getProductId().equals(productId)) {
            productById = product;
            break;
         }
      }
      return productById;
   }
   
}