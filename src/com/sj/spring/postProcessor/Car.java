package com.sj.spring.postProcessor;

public class Car {
    private String band;
    private String factory;
    public int price;

    public Car() {
        System.out.println("constructor");
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
        System.out.println("serPrice");
        this.price = price;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        System.out.println("serFactory");
        this.factory = factory;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        System.out.println("serBand");
        this.band = band;
    }
}
