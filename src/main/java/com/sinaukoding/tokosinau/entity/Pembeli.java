package com.sinaukoding.tokosinau.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pembelis")
@Getter
@Setter
public class Pembeli {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nama_pembeli;

    @Column
    private String jenis_kelamin;

    @Column
    private String no_telp;

    @Column
    private String alamat;
}

