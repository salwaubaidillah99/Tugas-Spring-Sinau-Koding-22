package com.sinaukoding.tokosinau.entity.mapping;

import com.sinaukoding.tokosinau.entity.Barang;
import com.sinaukoding.tokosinau.entity.Pembayaran;
import com.sinaukoding.tokosinau.entity.dto.BarangDTO;
import com.sinaukoding.tokosinau.entity.dto.PembayaranDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PembayaranMapping {
    PembayaranMapping instance = Mappers.getMapper(PembayaranMapping.class);
    Pembayaran toEntity(PembayaranDTO dto);
    PembayaranDTO toDto(Pembayaran param);
    List<PembayaranDTO> toListDto(List<Pembayaran> pembayaranList);
}
