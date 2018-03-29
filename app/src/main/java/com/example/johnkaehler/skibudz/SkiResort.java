package com.example.johnkaehler.skibudz;

/**
 * Created by John Kaehler on 3/20/2018.
 */

public class SkiResort {
    private String name, city, provinceOrState, country;
    private int skiResortId;

    public SkiResort(String name, String city, String provinceOrState, String country, int skiResortId) {
        this.name = name;
        this.city = city;
        this.provinceOrState = provinceOrState;
        this.country = country;
        this.skiResortId = skiResortId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvinceOrState() {
        return provinceOrState;
    }

    public void setProvinceOrState(String provinceOrState) {
        this.provinceOrState = provinceOrState;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getSkiResortId() {
        return skiResortId;
    }

    public void setSkiResortId(int skiResortId) {
        this.skiResortId = skiResortId;
    }
}
