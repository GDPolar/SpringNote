package com.sj.spring.collections;

public class Car {
    private String band;

    public void setBand(String band) {
        this.band = band;
    }

    @Override
    public String toString() {
        return "Car{" +
                "band='" + band + '\'' +
                '}';
    }

    public String getBand() {
        return band;
    }
}
