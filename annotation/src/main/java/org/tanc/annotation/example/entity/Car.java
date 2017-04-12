package org.tanc.annotation.example.entity;

import org.tanc.annotation.example.annotation.Column;
import org.tanc.annotation.example.annotation.Table;

/**
 * car 表的实体类
 * Created by tanc on 2017/4/12.
 */
@Table("car")
public class Car {

    @Column("brand")
    private String brand;

    @Column("price")
    private int price;

    @Column("model")
    private String model;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
