package com.sinaukoding.tokosinau.entity.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sinaukoding.tokosinau.entity.Pembeli;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class TransaksiDTO {
    private Long id;

    private Date tanggal;

    private String keterangan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PembeliDTO pembeli;

}

