package com.sj.spring.beans;

public class HelloWorld {
    private String name;
    private String add;

    @Override
    public String toString() {
        return "HelloWorld{" +
                "name='" + name + '\'' +
                ", add='" + add + '\'' +
                '}';
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public HelloWorld(String name, String add) {
        this.name = name;
        this.add = add;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello(){
        System.out.println(name);
    }

    public HelloWorld(String name) {
        this.name = name;
    }

}
