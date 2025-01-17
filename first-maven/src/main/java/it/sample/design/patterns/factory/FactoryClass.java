package it.sample.design.patterns.factory;

public class FactoryClass {
    // private Operations operations=null;
    // public Operations getOperations(String whichOne){
    //     if(whichOne.equalsIgnoreCase("employee")){
    //         operations = new Employees();
    //     }
    //     else if(whichOne.equalsIgnoreCase("product")){
    //         operations = new SuperMarket();
    //     }
    //     return operations;
    // }
    private static Operations operations=null;
    public static Operations getOperations(String whichOne){
        if(whichOne.equalsIgnoreCase("employee")){
            operations = new Employees();
        }
        else if(whichOne.equalsIgnoreCase("product")){
            operations = new SuperMarket();
        }
        return operations;
    }
}
