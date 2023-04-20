package com.sj.spring.collections;

import java.util.List;
import java.util.Map;

public class Person {
    private String name;
    private List<Car> cars;
    private Map<String, House> houses;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cars=" + cars +
                ", houses=" + houses +
                '}';
    }

    public Map<String, House> getHouses() {
        return houses;
    }

    public void setHouses(Map<String, House> houses) {
        this.houses = houses;
    }

    public String getName() {
        return name;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
