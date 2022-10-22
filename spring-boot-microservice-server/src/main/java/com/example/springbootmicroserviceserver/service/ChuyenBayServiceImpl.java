package com.example.springbootmicroserviceserver.service;

import com.example.springbootmicroserviceserver.entity.ChuyenBay;
import com.example.springbootmicroserviceserver.repository.ChuyenBayRepository;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService {
    @Autowired
    private ChuyenBayRepository chuyenBayRepository;

//    private static Logger logger = LogManager.getLogger(ChuyenBayController.class);

    @Override
    public List<ChuyenBay> getListChuyenBay() {
        List<ChuyenBay> chuyenbays = chuyenBayRepository.findAll();
        return chuyenbays;
    }

    @Override
    public ChuyenBay getChuyenBayById(String maCB) {
        Optional<ChuyenBay> chuyenBay = chuyenBayRepository.findById(maCB);
        return chuyenBay.get();
    }

    @Override
    public void saveChuyenBay(ChuyenBay chuyenBay) {
        chuyenBayRepository.saveAndFlush(chuyenBay);
    }

    @Override
    public void deleteChuyenBay(String maCB) {
        chuyenBayRepository.deleteById(maCB);
    }

    @Override
    public void insertChuyenBay(ChuyenBay chuyenBay) {
        chuyenBayRepository.saveAndFlush(chuyenBay);
    }

}
