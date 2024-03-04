package com.example.kotlin_learning;

public class Vehicle {
    private int speed;
    private String make;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Vehicle1{" +
                "speed=" + speed +
                ", make='" + make + '\'' +
                '}';
    }
}
