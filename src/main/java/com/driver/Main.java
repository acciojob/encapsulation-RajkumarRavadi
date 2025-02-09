package com.driver;

public class Main {
    public static void main(String[] args) {
        //creating object of RWOnly
        RWOnly obj = new RWOnly();

        //hence the java name has private access
        // we will get errors if we try to access it normally
        //we have to use the getter and setter for private variables
        //System.out.println(obj.name);

        obj.setName("Rajkumar");

        System.out.println(obj.getName());


    }
}