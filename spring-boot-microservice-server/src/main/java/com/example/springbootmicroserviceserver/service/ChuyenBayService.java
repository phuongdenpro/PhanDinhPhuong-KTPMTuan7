package com.example.springbootmicroserviceserver.service;
import com.example.springbootmicroserviceserver.entity.ChuyenBay;

import java.util.List;

public interface ChuyenBayService {
    List<ChuyenBay> getListChuyenBay();

    ChuyenBay getChuyenBayById(String maCB);

    void saveChuyenBay(ChuyenBay chuyenBay);

    void deleteChuyenBay(String maCB);

    void insertChuyenBay(ChuyenBay chuyenBay);
}