package com.sinaukoding.tokosinau.service.impl;

import com.sinaukoding.tokosinau.entity.Pembeli;
import com.sinaukoding.tokosinau.entity.Supplier;
import com.sinaukoding.tokosinau.entity.dto.PembeliDTO;
import com.sinaukoding.tokosinau.entity.dto.SupplierDTO;
import com.sinaukoding.tokosinau.entity.mapping.PembeliMapping;
import com.sinaukoding.tokosinau.entity.mapping.SupplierMapping;
import com.sinaukoding.tokosinau.repository.PembeliRepository;
import com.sinaukoding.tokosinau.repository.SupplierRepository;
import com.sinaukoding.tokosinau.service.PembeliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PembeliServiceImpl implements PembeliService {

    @Autowired
    private PembeliRepository repository;

    @Override
    public PembeliDTO save(PembeliDTO param) {
        Pembeli data = repository.save(PembeliMapping.instance.toEntity(param));
        return PembeliMapping.instance.toDto(data);
    }

    @Override
    public List<PembeliDTO> findAllData()
    {
        return PembeliMapping.instance.toListDto(repository.findAll());
    }

    @Override
    public PembeliDTO update(PembeliDTO param, Long id) {
        Pembeli data = repository.findById(id).orElse(null);

        if (data != null) {
            data.setNamaPembeli(param.getNamaPembeli() == null ? data.getNamaPembeli() : param.getNamaPembeli());
            data.setJenisKelamin(param.getJenisKelamin() != null ? param.getJenisKelamin() : data.getJenisKelamin());
            data.setNoTelp(param.getNoTelp() != null ? param.getNoTelp() : data.getNoTelp());
            data.setAlamat(param.getAlamat() != null ? param.getAlamat() : data.getAlamat());

            return PembeliMapping.instance.toDto(repository.save(data));
        }

        return PembeliMapping.instance.toDto(data);
    }

    @Override
    public Boolean delete(Long id) {
        Pembeli data = repository.findById(id).orElse(null);

        if (data != null){
            repository.delete(data);
            return true;
        }

        return false;
    }

    @Override
    public PembeliDTO findById(Long id) {
        return PembeliMapping.instance.toDto(repository.findById(id).orElse(null));
    }
}


