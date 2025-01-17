package it.sample.design.patterns.factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuperMarket implements Operations{
    // storage
    private List<String> products = new ArrayList<>();
    // init
    public SuperMarket(){
        products.add("Transcend Perndrive");
        products.add("HP Pavilion");
        products.add("Lenovo ThinkPad");
    }
    @Override
    public void update(String oldOne, String newOne) {
        // TODO Auto-generated method stub
        if(products.contains(oldOne)){
            Collections.replaceAll(products, oldOne, newOne);
            System.out.println(newOne+" replaced the "+oldOne);
        }
        else{
            System.out.println(oldOne+" doesn't exists");
        }
    }
    @Override
    public String delete(String exists) {
        // TODO Auto-generated method stub
        if(products.contains(exists)){
            products.remove(exists);
            return exists+" removed from stock";
        }
        return exists+" out of stock";
    }
}
