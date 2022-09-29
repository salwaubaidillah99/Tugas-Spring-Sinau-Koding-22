package com.sinaukoding.tokosinau.service.impl;


import com.sinaukoding.tokosinau.entity.Pembeli;

import com.sinaukoding.tokosinau.entity.Transaksi;
import com.sinaukoding.tokosinau.entity.dto.TransaksiDTO;
import com.sinaukoding.tokosinau.entity.mapping.PembeliMapping;
import com.sinaukoding.tokosinau.entity.mapping.TransaksiMapping;
import com.sinaukoding.tokosinau.repository.PembeliRepository;
import com.sinaukoding.tokosinau.repository.TransaksiRepository;
import com.sinaukoding.tokosinau.service.TransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransaksiServiceImpl implements TransaksiService {

    @Autowired
    private TransaksiRepository repository;

    @Autowired
    private PembeliRepository pembeliRepository;

    @Override
    public TransaksiDTO save(TransaksiDTO param) {
        Pembeli pembeli = PembeliMapping.instance.toEntity(param.getPembeli());

        Transaksi data = TransaksiMapping.instance.toEntity(param);

        if (param.getPembeli() != null) {
            pembeli = pembeliRepository.save(pembeli);

            data.getPembeli().setId(pembeli.getId());
        }

        data = repository.save(data);

        return TransaksiMapping.instance.toDto(data);
    }

    @Override
    public List<TransaksiDTO> findAllData() {

        return TransaksiMapping.instance.toListDto(repository.findAll());
    }

    @Override
    public TransaksiDTO update(TransaksiDTO param, Long id) {
        Transaksi data = repository.findById(id).orElse(null);

        if (data != null) {
            data.setTanggal(param.getTanggal() == null ? data.getTanggal() : param.getTanggal());
            data.setKeterangan(param.getKeterangan() != null ? param.getKeterangan() : data.getKeterangan());


            return TransaksiMapping.instance.toDto(repository.save(data));
        }

        return TransaksiMapping.instance.toDto(data);
    }

    @Override
    public Boolean delete(Long id) {
        Transaksi data = repository.findById(id).orElse(null);

        if (data != null) {
            repository.delete(data);
            return true;
        }

        return false;
    }

    @Override
    public TransaksiDTO findById(Long id) {
        return TransaksiMapping.instance.toDto(repository.findById(id).orElse(null));
    }
}




