package com.cc.java;

public class Bird implements Flyable, IFeathers{

    @Override
    public String fly() {
        // TODO Auto-generated method stub
        return "I can fly.";
    }

    @Override
    public String hasFeathers() {
        // TODO Auto-generated method stub
        return "I have feathers.";
    }
  
}
