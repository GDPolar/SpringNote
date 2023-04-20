package com.sj.spring.beans;

public class Person {
    private String name;
    private Person mate;

    public String getName() {
        return name;
    }

    public Person getMate() {
        return mate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", mate='" + mate + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMate(Person mate) {
        this.mate = mate;
    }
}
