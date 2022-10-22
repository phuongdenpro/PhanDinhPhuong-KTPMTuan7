package com.example.springbootmicroservice.service;

import com.example.springbootmicroservice.entity.ChuyenBay;

import java.util.List;
import java.util.Optional;

public interface ChuyenBayService {
    List<ChuyenBay> getListChuyenBay();

    ChuyenBay getChuyenBayById(String maCB);

    void saveChuyenBay(ChuyenBay chuyenBay);

    void deleteChuyenBay(String maCB);

    public void insertChuyenBay(ChuyenBay chuyenBay);
}