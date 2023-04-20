package com.sj.spring.beansFactory;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {
    private static Map<String, Car> carFactory = new HashMap<>();

    static {
        carFactory.put("car1", new Car("car1"));
        carFactory.put("car2", new Car("car2"));
    }

    //不能为static
    public Car getCar(String name){
        return carFactory.get(name);
    }
}
