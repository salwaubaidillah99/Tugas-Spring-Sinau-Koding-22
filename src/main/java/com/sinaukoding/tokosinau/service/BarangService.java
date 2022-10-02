package com.sinaukoding.tokosinau.service;

import com.sinaukoding.tokosinau.entity.Barang;
import com.sinaukoding.tokosinau.entity.dto.BarangDTO;

import java.util.List;

public interface BarangService {
    BarangDTO save(BarangDTO param);

    List<BarangDTO> findAllData();

    BarangDTO update(BarangDTO param, Long id);

    Boolean delete(Long id);

    BarangDTO findById(Long id);
}
