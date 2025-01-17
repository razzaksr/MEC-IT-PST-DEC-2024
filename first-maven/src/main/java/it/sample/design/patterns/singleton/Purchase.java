package it.sample.design.patterns.singleton;

public class Purchase {
    public static void main(String[] args) {
        //Product product=new Product();
        Product product = Product.getProduct();
        product.setProductName("Epson Projector");
        product.setProductPrice(29880);
        product.setProductQuantity(1);
        System.out.println(product);
        //Product product1=new Product("Dell Studio",29552,3);
        // System.out.println(product1.getProductName()+" "+product1.getProductPrice()+" "+product1.getProductQuantity());
        Product product1 = Product.getProduct("Dell Studio",29552,3);
        System.out.println(product1.getProductName()+" "+product1.getProductPrice()+" "+product1.getProductQuantity());
    }
}
