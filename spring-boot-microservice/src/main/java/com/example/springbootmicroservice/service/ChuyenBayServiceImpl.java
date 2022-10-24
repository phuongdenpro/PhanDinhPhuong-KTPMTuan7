package com.example.springbootmicroservice.service;

import com.example.springbootmicroservice.controller.ChuyenBayController;
import com.example.springbootmicroservice.entity.ChuyenBay;
import com.google.gson.Gson;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService {
    static final String BASE_URL = "http://localhost:8080/chuyen-bay";
    private static Gson gson = new Gson();

    private static RestTemplate restTemplate = new RestTemplate();
    ;

    private static Logger logger = LogManager.getLogger(ChuyenBayController.class);

    @Override
    public List<ChuyenBay> getListChuyenBay() {
        Object[] listChuyenBay = restTemplate.getForEntity(BASE_URL, Object[].class).getBody();
        List<ChuyenBay> arrChuyenBay = new ArrayList<>();
        for (Object item : listChuyenBay) {
            arrChuyenBay.add(gson.fromJson(gson.toJson(item), ChuyenBay.class));
        }
        return arrChuyenBay;
    }

    @Override
    public ChuyenBay getChuyenBayById(String maCB) {
        Object chuyenBay = restTemplate.getForEntity(BASE_URL + "/" + maCB, Object.class).getBody();
        if (chuyenBay == null) {
            return null;
        }
        return gson.fromJson(gson.toJson(chuyenBay), ChuyenBay.class);
    }

    @Override
    public void saveChuyenBay(ChuyenBay chuyenBay) {
        Map< String, String > params = new HashMap< String, String >();
        params.put("maCB", chuyenBay.getMaCB());
        restTemplate.put(BASE_URL + "/" + chuyenBay.getMaCB(), chuyenBay, params);
    }

    @Override
    public void deleteChuyenBay(String maCB) {
        Map< String, String > params = new HashMap< String, String >();
        params.put("maCB", maCB);
        restTemplate.delete(BASE_URL + "/" + maCB, params);
    }

    @Override
    public void insertChuyenBay(ChuyenBay chuyenBay) {
        restTemplate.postForEntity(BASE_URL, chuyenBay, ChuyenBay.class);
    }
}