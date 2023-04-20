package com.sj.spring.collections;

public class House {
    @Override
    public String toString() {
        return "House{" +
                "area='" + area + '\'' +
                '}';
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    private String area;
}
