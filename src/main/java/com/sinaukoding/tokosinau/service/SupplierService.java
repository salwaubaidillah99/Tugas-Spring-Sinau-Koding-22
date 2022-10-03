package com.sinaukoding.tokosinau.service;

import com.sinaukoding.tokosinau.entity.dto.SupplierDTO;
import java.util.List;

public interface SupplierService {
    SupplierDTO save(SupplierDTO param);

    List<SupplierDTO>findAllData();

    SupplierDTO update(SupplierDTO param, Long id);

    Boolean delete(Long id);

    SupplierDTO findById(Long id);
}
