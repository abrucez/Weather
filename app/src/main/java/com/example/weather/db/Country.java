package com.example.weather.db;

import com.google.gson.Gson;

import org.litepal.crud.DataSupport;

/**
 * Created by 13243 on 2019/4/22.
 */

public class Country extends DataSupport {

    /**
     * id : 1
     * countryName : 中国
     * weatherId : 2
     * cityId : 3
     */

    private int id;
    private String countyName;
    private int weatherId;
    private int cityId;

    public static Country objectFromData(String str) {

        return new Gson().fromJson(str, Country.class);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countyName;
    }

    public void setCountryName(String countryName) {
        this.countyName = countryName;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
