package com.example.backendmaping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;


@Getter
@Setter
@Entity(name = "Product")
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "`id`")
    private int id;
        @Column(name = "`name`")
    private String name;
        @Column(name = "`desc`")
    private String desc;
    @Column(name = "`quantity`")
    private int quantity;
    @Column(name = "`price`")
    private int price;
}
