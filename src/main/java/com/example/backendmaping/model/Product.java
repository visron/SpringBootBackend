package com.example.backendmaping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;


@Getter
@Setter
@Entity
@Table
public class Product {

    @Id
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
