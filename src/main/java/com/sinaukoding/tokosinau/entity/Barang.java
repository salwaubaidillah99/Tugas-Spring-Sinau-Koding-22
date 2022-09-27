package com.sinaukoding.tokosinau.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "barangs")
@Getter
@Setter
public class Barang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nama_barang;

    @Column
    private Double harga;

    @Column
    private Integer stok;



}
