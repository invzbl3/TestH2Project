package com.test.project.entity;

import javax.persistence.*;
/**
 * @author invzbl3 on 11/21/2022
 * @project TestH2Project
 */

@Entity(name = "ITEM_ENTITY")
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String designation;
}