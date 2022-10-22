package com.example.springbootmicroservice.controller;

import com.example.springbootmicroservice.entity.ChuyenBay;
import com.example.springbootmicroservice.service.ChuyenBayService;
import com.google.gson.Gson;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/chuyen-bay")
public class ChuyenBayController {
    private static Logger logger = LogManager.getLogger(ChuyenBayController.class);
    private static Gson gson = new Gson();
    @Autowired
    private ChuyenBayService chuyenBayService;

    // [GET] /chuyen-bay
    @GetMapping("")
    public String getChuyenBay() {
        List<ChuyenBay> dsChuyenBay = chuyenBayService.getListChuyenBay();
        return gson.toJson(dsChuyenBay);
    }

    // [POST] /chuyen-bay
    @PostMapping("")
    public String addChuyenBay(@RequestBody ChuyenBay chuyenBay) {
        chuyenBayService.insertChuyenBay(chuyenBay);
        return gson.toJson(chuyenBay);
    }

    // [GET] /chuyen-bay/{id}
    @GetMapping("/{id}")
    public String getChuyenBayById(@PathVariable(value = "id") String maCB) {
        ChuyenBay chuyenBay = chuyenBayService.getChuyenBayById(maCB);
        return gson.toJson(chuyenBay);
    }

    // [GET] /chuyen-bay/{id}
    @PatchMapping("/{id}")
    public String updateChuyenBayById(@PathVariable(value = "id") String maCB, @RequestBody ChuyenBay chuyenBay) {
        ChuyenBay oldChuyenBay = chuyenBayService.getChuyenBayById(maCB);
        chuyenBay.setMaCB(maCB);
        chuyenBayService.saveChuyenBay(chuyenBay);
        return gson.toJson(chuyenBay);
    }

    // [POST] /chuyen-bay/delete/{id}
    @DeleteMapping("/delete/{id}")
    public String deleteChuyenBayById(@PathVariable(value = "id") String maCB) {
        ChuyenBay chuyenBay = chuyenBayService.getChuyenBayById(maCB);
        chuyenBayService.deleteChuyenBay(maCB);
        return gson.toJson(chuyenBay);
    }
}