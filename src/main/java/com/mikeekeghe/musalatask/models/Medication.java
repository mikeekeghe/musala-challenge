package com.mikeekeghe.musalatask.models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

public class Medication implements Serializable {
    @Getter
    @Setter
    private BigDecimal weight;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String code;
    @Getter
    @Setter
    private String imageUrl;

    @Override
    public String toString() {
        return "Medication{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
