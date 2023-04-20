package com.sj.spring.spel;

public class Person {
    private Car car;
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "car=" + car +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
