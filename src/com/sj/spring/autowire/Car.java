package com.sj.spring.autowire;

public class Car {
    private String band;
    private String factory;

    @Override
    public String toString() {
        return "Car{" +
                "band='" + band + '\'' +
                ", factory='" + factory + '\'' +
                '}';
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }
}
