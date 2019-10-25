package com.udamy.spring;

public class FactoryC {
    public Second createSecond(int id, String name){
        System.out.println("Creating bean by factory");
        return new Second(id, name);
    }
}
