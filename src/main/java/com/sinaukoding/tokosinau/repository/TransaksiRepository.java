package com.sinaukoding.tokosinau.repository;

import com.sinaukoding.tokosinau.entity.Barang;
import com.sinaukoding.tokosinau.entity.Transaksi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransaksiRepository extends JpaRepository<Transaksi, Long> {

}
