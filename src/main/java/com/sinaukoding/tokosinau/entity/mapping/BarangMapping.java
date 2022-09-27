package com.sinaukoding.tokosinau.entity.mapping;

import com.sinaukoding.tokosinau.entity.Barang;
import com.sinaukoding.tokosinau.entity.Pembeli;
import com.sinaukoding.tokosinau.entity.dto.BarangDTO;
import com.sinaukoding.tokosinau.entity.dto.PembeliDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface BarangMapping {
    BarangMapping instance = Mappers.getMapper(BarangMapping.class);
    Barang toEntity(BarangDTO dto);
    BarangDTO toDto(Barang parm);
    List<BarangDTO> toListDto(List<Barang>barangList);
}
