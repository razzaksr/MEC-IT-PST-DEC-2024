package it.sample.design.patterns.factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employees implements Operations{
    // stirage
    private List<String> members = new ArrayList<>();
    // init
    public Employees(){
        members.add("Jothinathan");
        members.add("Darshini");
        members.add("Abhinaya");
    }
    @Override
    public void update(String oldOne, String newOne) {
        // TODO Auto-generated method stub
        if(members.contains(oldOne)){
            Collections.replaceAll(members, oldOne, newOne);
            System.out.println(newOne+" replaced the "+oldOne);
        }
        else{
            System.out.println(oldOne+" doesn't exists");
        }
    }
    @Override
    public String delete(String exists) {
        // TODO Auto-generated method stub
        if(members.contains(exists)){
            members.remove(exists);
            return exists+" has been fired";
        }
        return exists+" dosn't exists";
    }
}
