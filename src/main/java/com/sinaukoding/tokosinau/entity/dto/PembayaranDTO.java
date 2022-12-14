package com.sinaukoding.tokosinau.entity.dto;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PembayaranDTO {
    private Long id;


    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date tglBayar;

    private Integer totalBayar;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private TransaksiDTO transaksi;
}
