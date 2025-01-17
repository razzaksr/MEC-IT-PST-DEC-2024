package it.sample.design.patterns.factory;

public class Main {
    public static void main(String[] args) {
        Operations operations = FactoryClass.getOperations("employee");
        operations.update("Preethi", "Vetri");
        System.out.println(operations.delete("Darshini"));
        Operations operations1 = FactoryClass.getOperations("product");
        operations1.update("Lenovo ThinkPad", "Lenovo IdeaPad");
        System.out.println(operations1.delete("Dell Vostro"));
    }
}
