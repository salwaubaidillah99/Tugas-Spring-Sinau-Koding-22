package com.sinaukoding.tokosinau.controller;
import com.sinaukoding.tokosinau.entity.dto.PembeliDTO;
import com.sinaukoding.tokosinau.entity.Pembeli;
import com.sinaukoding.tokosinau.entity.dto.SupplierDTO;
import com.sinaukoding.tokosinau.service.impl.PembeliServiceImpl;
import com.sinaukoding.tokosinau.service.impl.SupplierServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.sinaukoding.tokosinau.common.Response;

import java.util.List;

@RestController
@RequestMapping("/pembelis")
public class PembeliController {
    @Autowired
    private PembeliServiceImpl service;

    @GetMapping("/find-all")
    public Response findAllData(){
        List<PembeliDTO> data = service.findAllData();
        return new Response(data, "Get All Data Pembeli", data.size(), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?>saveData(@RequestBody PembeliDTO param){
        return new ResponseEntity<>(service.save(param),HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?>updateData(@PathVariable Long id,
                                       @RequestBody PembeliDTO param){
        PembeliDTO data = service.update(param, id);

        if (data != null){
            return  new ResponseEntity<>(data, HttpStatus.OK);
        }
        else
        {
            return  new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
        }
    }
    @GetMapping("/find-by-id/{id}")
    public Response findById(@PathVariable Long id){
        return new Response(service.findById(id), "Berhasil Mengabil Data dari id " + id, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public Response deleteData(@PathVariable Long id){
        if (service.delete(id)){
            return new Response("Data Berhasil di Hapus",HttpStatus.OK);
        }else{
            return new Response("Data Gagal di Hapus",HttpStatus.BAD_REQUEST);
        }
    }
}