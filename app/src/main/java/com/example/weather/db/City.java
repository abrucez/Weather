package com.example.weather.db;

import com.google.gson.Gson;

import org.litepal.crud.DataSupport;

/**
 * Created by 13243 on 2019/4/22.
 */

public class City extends DataSupport {

    /**
     * id : 001
     * cityName : 洛阳
     * cityCode : 002
     * provinceId : 003
     */

    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public static City objectFromData(String str) {

        return new Gson().fromJson(str, City.class);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
