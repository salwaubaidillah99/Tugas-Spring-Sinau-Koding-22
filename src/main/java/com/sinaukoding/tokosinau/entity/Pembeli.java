package com.sinaukoding.tokosinau.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pembelis")
@Getter
@Setter
public class Pembeli {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "INTEGER(11)")
    private Long id;

    @Column(columnDefinition = "VARCHAR(30)")
    private String nama_pembeli;

    @Column(columnDefinition = "VARCHAR(30)")
    private String jenis_kelamin;

    @Column(columnDefinition = "VARCHAR(30)")
    private String no_telp;

    @Column(columnDefinition = "VARCHAR(30)")
    private String alamat;

    @OneToMany(mappedBy = "pembeli")
    private List<Transaksi> transaksiList;
}

