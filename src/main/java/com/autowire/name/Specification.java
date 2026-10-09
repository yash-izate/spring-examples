package com.autowire.name;

public class Specification {
    private String make;
    private String model;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
        System.out.println("setter called make");
    }

    public String getModel() {
        System.out.println("setter called model");
        return model;
    }

    public void setModel(String model) {
        this.model = model;
        System.out.println("Setter called setModel");
    }

    @Override
    public String toString() {
        return "Specification{" + "make='" + make + '\'' + ", model='" + model + '\'' + '}';
    }
}