package com.sinaukoding.tokosinau.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transaksis")
@Getter
@Setter
public class Transaksi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(columnDefinition = "integer", length = 11)
    private Long id;

    //@Column(columnDefinition = "date")
    private Date tanggal;

    //@Column(columnDefinition = "varchar", length = 11)
    private String keterangan;

    //@Column(columnDefinition = "integer", length = 11)
    private Integer stok;

    @ManyToOne
    @JoinColumn(name = "id_pembeli")
    private Pembeli pembeli;







}
