package com.sinaukoding.tokosinau.entity.mapping;

import com.sinaukoding.tokosinau.entity.Barang;
import com.sinaukoding.tokosinau.entity.dto.BarangDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface BarangMapping {
    BarangMapping instance = Mappers.getMapper(BarangMapping.class);
    Barang toEntity(BarangDTO dto);
    BarangDTO toDto(Barang param);
    List<BarangDTO> toListDto(List<Barang> barangList);
}
