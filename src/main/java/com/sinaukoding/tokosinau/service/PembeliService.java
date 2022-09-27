package com.sinaukoding.tokosinau.service;

import com.sinaukoding.tokosinau.entity.Pembeli;
import com.sinaukoding.tokosinau.entity.dto.PembeliDTO;

import java.util.List;

public interface PembeliService {

    PembeliDTO save(PembeliDTO param);

    List<PembeliDTO> findAllData();


    PembeliDTO update(PembeliDTO param, Long id);

    Boolean delete(Long id);

    PembeliDTO findById(Long id);
}


