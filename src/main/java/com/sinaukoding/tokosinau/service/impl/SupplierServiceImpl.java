package com.sinaukoding.tokosinau.service.impl;

import com.sinaukoding.tokosinau.entity.Supplier;
import com.sinaukoding.tokosinau.entity.dto.SupplierDTO;
import com.sinaukoding.tokosinau.entity.mapping.SupplierMapping;
import com.sinaukoding.tokosinau.repository.SupplierRepository;
import com.sinaukoding.tokosinau.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierRepository repository;

    @Override
    public SupplierDTO save(SupplierDTO param) {
        Supplier data = repository.save(SupplierMapping.instance.toEntity(param));
        return SupplierMapping.instance.toDto(data);
    }

    @Override
    public List<SupplierDTO> findAllData()
    {
        return SupplierMapping.instance.toListDto(repository.findAll());
    }

    @Override
    public SupplierDTO update(SupplierDTO param, Long id) {
        Supplier data = repository.findById(id).orElse(null);

        if (data != null) {
            data.setNamaSupplier(param.getNamaSupplier() == null ? data.getNamaSupplier() : param.getNamaSupplier());
            data.setNoTelp(param.getNoTelp() != null ? param.getNoTelp() : data.getNoTelp());
            data.setAlamat(param.getAlamat() != null ? param.getAlamat() : data.getAlamat());

            return SupplierMapping.instance.toDto(repository.save(data));
        }

        return SupplierMapping.instance.toDto(data);
    }

    @Override
    public Boolean delete(Long id) {
        Supplier data = repository.findById(id).orElse(null);

        if (data != null){
            repository.delete(data);
            return true;
        }

        return false;
    }

    @Override
    public SupplierDTO findById(Long id) {
        return SupplierMapping.instance.toDto(repository.findById(id).orElse(null));
    }
}

