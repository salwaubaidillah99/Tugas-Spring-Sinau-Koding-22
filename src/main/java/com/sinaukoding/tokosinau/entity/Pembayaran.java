package com.sinaukoding.tokosinau.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Pembayarans")
@Getter
@Setter
public class Pembayaran {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "integer", length = 11)
    private Long id;

    @Column
    private Date tglBayar;

    @Column(columnDefinition = "integer", length = 11)
    private Double totalBayar;

    @ManyToOne
    @JoinColumn(name = "id_transaksi")
    private Transaksi transaksi;


}
