package com.example.weather.db;

import com.google.gson.Gson;

import org.litepal.crud.DataSupport;

/**
 * Created by 13243 on 2019/4/22.
 */

public class Province extends DataSupport {

    /**
     * id : 1
     * provinceName : 河南
     * provinceCode : 123
     */

    private int id;
    private String provinceName;
    private int provinceCode;

    public static Province objectFromData(String str) {

        return new Gson().fromJson(str, Province.class);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
