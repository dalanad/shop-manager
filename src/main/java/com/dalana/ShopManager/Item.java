package com.dalana.ShopManager;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Item {

    @Id
    @GeneratedValue
    Long id;


    @Column
    String name;
    @Column
    Float price;
    @Column
    Integer stock;
    @Column
    String unit;
}
