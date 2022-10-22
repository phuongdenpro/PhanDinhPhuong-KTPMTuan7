package com.example.springbootmicroservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.io.Serializable;
import java.sql.Time;


@Getter
@Setter
public class ChuyenBay implements Serializable {

    private String maCB;


    private String gaDi;


    private String gaDen;


    private int doDai;


    private Time gioDi;


    private Time gioDen;


    private int chiPhi;

    public ChuyenBay() {
    }

    public ChuyenBay(String gaDi, String gaDen, int doDai, Time gioDi, Time gioDen, int chiPhi) {
        this.gaDi = gaDi;
        this.gaDen = gaDen;
        this.doDai = doDai;
        this.gioDi = gioDi;
        this.gioDen = gioDen;
        this.chiPhi = chiPhi;
    }

    public ChuyenBay(String macb, String gaDi, String gaDen, int doDai, Time gioDi, Time gioDen, int chiPhi) {
        this.maCB = macb;
        this.gaDi = gaDi;
        this.gaDen = gaDen;
        this.doDai = doDai;
        this.gioDi = gioDi;
        this.gioDen = gioDen;
        this.chiPhi = chiPhi;
    }
}