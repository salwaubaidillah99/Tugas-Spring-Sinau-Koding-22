package com.sinaukoding.tokosinau.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pembelis")
@Getter
@Setter
@NoArgsConstructor
public class Pembeli {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "BIGINT(11)")
    private Long id;

    @Column(columnDefinition = "VARCHAR(30)")
    private String namaPembeli;

    @Column(columnDefinition = "CHAR(1)")
    private String jenisKelamin;

    @Column(columnDefinition = "VARCHAR(13)")
    private String noTelp;

    @Column(columnDefinition = "VARCHAR(100)")
    private String alamat;

    @OneToMany(mappedBy = "pembeli")
    private List<Transaksi> transaksiList;

}

