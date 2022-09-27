package com.sinaukoding.tokosinau.entity.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BarangDTO {
    private Long id;

    private String nama_barang;

    private Double harga;

    private Integer stok;
}
