package io.pragra.learaning.angularfusion.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "product_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 255)
    private String sku;

    @Column
    private String imageUrl;

    @Column
    private double price;

    @Column
    private String shortDec;

    @Column(length = 1000)
    private String description;

    private String locationCode;

}
