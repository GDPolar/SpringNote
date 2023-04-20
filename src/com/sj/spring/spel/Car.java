package com.sj.spring.spel;

public class Car {
    private String band;
    private String factory;
    public int price;

    public Car() {
        System.out.println("constructor");
    }

    public Car(String band) {
        this.band = band;
    }

    public void myInit(){
        System.out.println("init");
    }
    public void myDestroy(){
        System.out.println("destroy");
    }

    @Override
    public String toString() {
        return "Car{" +
                "band='" + band + '\'' +
                ", factory='" + factory + '\'' +
                ", price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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
