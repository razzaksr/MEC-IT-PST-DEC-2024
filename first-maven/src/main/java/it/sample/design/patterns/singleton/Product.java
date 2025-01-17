package it.sample.design.patterns.singleton;

// encapsulated class/ business class/ entity class/ model class
public class Product {
    private String productName;
    private double productPrice;
    private int productQuantity;
    // inner object
    private static Product product = new Product();
    public static Product getProduct(){
        return product;
    }
    public static Product getProduct(String proName,double proPrice, int proQty){
        product.setProductName(proName);
        product.setProductPrice(proPrice);
        product.setProductQuantity(proQty);
        return product;
    }
    // default
    private Product() {
    }
    // parameterized
    private Product(String productName, double productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }
    @Override
    public String toString() {
        return "Product [productName=" + productName + ", productPrice=" + productPrice + ", productQuantity="
                + productQuantity + "]";
    }
    // setter
    public void setProductName(String productName){
        this.productName=productName;
    }
    // getter
    public String getProductName(){
        return productName;
    }
    public double getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    public int getProductQuantity() {
        return productQuantity;
    }
    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
}
