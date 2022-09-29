package com.sinaukoding.tokosinau.controller;

import com.sinaukoding.tokosinau.common.Response;
import com.sinaukoding.tokosinau.entity.dto.PembayaranDTO;
import com.sinaukoding.tokosinau.service.impl.PembayaranServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/pembayarans")

public class PembayaranController {

    @Autowired
    private PembayaranServiceImpl service;

    @GetMapping("/find-all")
    public Response findAllData(){
        List<PembayaranDTO> data = service.findAllData();
        return new Response(data, "Get All Data Pembayaran", data.size(), HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<?> saveData(@RequestBody PembayaranDTO param){
        return new ResponseEntity<>(service.save(param), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateData(@PathVariable Long id,
                                        @RequestBody PembayaranDTO param){
        PembayaranDTO data = service.update(param, id);

        if (data != null) {
            return new ResponseEntity<>(data, HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
        }
    }

    @GetMapping("/find-by-id/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @GetMapping("/find-by-id")
    public ResponseEntity<?> findById2(@RequestParam(name = "id") Long id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteData(@PathVariable Long id){
        if (service.delete(id)){
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
        }


    }
}
