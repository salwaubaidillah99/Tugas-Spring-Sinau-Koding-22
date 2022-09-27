package com.sinaukoding.tokosinau.entity.mapping;

import com.sinaukoding.tokosinau.entity.Pembeli;
import com.sinaukoding.tokosinau.entity.Supplier;
import com.sinaukoding.tokosinau.entity.dto.PembeliDTO;
import com.sinaukoding.tokosinau.entity.dto.SupplierDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface SupplierMapping {
    SupplierMapping instance = Mappers.getMapper(SupplierMapping.class);
    Supplier toEntity(SupplierDTO dto);
    SupplierDTO toDto(Supplier parm);
    List<SupplierDTO> toListDto(List<Supplier>supplierList);
}
