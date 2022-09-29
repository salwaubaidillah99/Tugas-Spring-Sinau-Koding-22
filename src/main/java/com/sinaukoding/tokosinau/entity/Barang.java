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
    @Column(columnDefinition = "integer", length = 11)
    private Long id;

    @Column(columnDefinition = "varchar", length = 20)
    private String namaBarang;

    @Column(columnDefinition = "integer", length = 11)
    private Double harga;

    @Column(columnDefinition = "integer", length = 11)
    private Integer stok;

    @ManyToOne
    @JoinColumn(name = "id_supplier")
    private Supplier supplier;



}
