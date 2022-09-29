package com.sinaukoding.tokosinau.service.impl;


import com.sinaukoding.tokosinau.entity.Pembayaran;
import com.sinaukoding.tokosinau.entity.Transaksi;
import com.sinaukoding.tokosinau.entity.dto.PembayaranDTO;
import com.sinaukoding.tokosinau.entity.mapping.PembayaranMapping;
import com.sinaukoding.tokosinau.entity.mapping.TransaksiMapping;
import com.sinaukoding.tokosinau.repository.PembayaranRepository;
import com.sinaukoding.tokosinau.repository.TransaksiRepository;
import com.sinaukoding.tokosinau.service.PembayaranService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class PembayaranServiceImpl implements PembayaranService {

    @Autowired
    private PembayaranRepository repository;

    @Autowired
    private TransaksiRepository transaksiRepository;

    @Override
    public PembayaranDTO save(PembayaranDTO param) {
        Transaksi transaksi = TransaksiMapping.instance.toEntity(param.getTransaksi());

        Pembayaran data = PembayaranMapping.instance.toEntity(param);

        if (param.getTransaksi() != null) {
            transaksi = transaksiRepository.save(transaksi);

            data.getTransaksi().setId(transaksi.getId());
        }

        data = repository.save(data);

        return PembayaranMapping.instance.toDto(data);
    }

    @Override
    public List<PembayaranDTO> findAllData()
    {
        return PembayaranMapping.instance.toListDto(repository.findAll());
    }

    @Override
    public PembayaranDTO update(PembayaranDTO param, Long id) {
        Pembayaran data = repository.findById(id).orElse(null);

        if (data != null) {
            data.setTglBayar(param.getTglBayar() == null ? data.getTglBayar() : param.getTglBayar());
            data.setTotalBayar(param.getTotalBayar() != null ? param.getTotalBayar() : data.getTotalBayar());

            return PembayaranMapping.instance.toDto(repository.save(data));
        }

        return PembayaranMapping.instance.toDto(data);
    }

    @Override
    public Boolean delete(Long id) {
        Pembayaran data = repository.findById(id).orElse(null);

        if (data != null){
            repository.delete(data);
            return true;
        }

        return false;
    }

    @Override
    public PembayaranDTO findById(Long id) {
        return PembayaranMapping.instance.toDto(repository.findById(id).orElse(null));
    }
}



