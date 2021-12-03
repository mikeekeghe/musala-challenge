package com.mikeekeghe.musalatask.models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class Drone implements Serializable {
    @Getter
    @Setter
    private int serialNumber;
    @Getter
    @Setter
    private String model;
    @Getter
    @Setter
    private String state;
    @Getter
    @Setter
    private int weight;
    @Getter
    @Setter
    private int batteryCapacity;

    @Override
    public String toString() {
        return "Drone{" +
                "serialNumber=" + serialNumber +
                ", model='" + model + '\'' +
                ", state='" + state + '\'' +
                ", weight=" + weight +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}
