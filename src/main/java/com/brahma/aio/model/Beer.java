package com.brahma.aio.model;

import org.springframework.stereotype.Component;

@Component
public class Beer {
    private Integer id;
    private  String uid;
    private String brand;
    private String name;
    private String style;
    private String hop;
    private String yeast;
    private String malts;
    private String ibu;
    private String alcohol;
    private String blg;

    public Beer() {
    }

    public Beer(Integer id, String uid, String brand, String name, String style, String hop, String yeast, String malts, String ibu, String alcohol, String blg) {
        this.id = id;
        this.uid = uid;
        this.brand = brand;
        this.name = name;
        this.style = style;
        this.hop = hop;
        this.yeast = yeast;
        this.malts = malts;
        this.ibu = ibu;
        this.alcohol = alcohol;
        this.blg = blg;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getHop() {
        return hop;
    }

    public void setHop(String hop) {
        this.hop = hop;
    }

    public String getYeast() {
        return yeast;
    }

    public void setYeast(String yeast) {
        this.yeast = yeast;
    }

    public String getMalts() {
        return malts;
    }

    public void setMalts(String malts) {
        this.malts = malts;
    }

    public String getIbu() {
        return ibu;
    }

    public void setIbu(String ibu) {
        this.ibu = ibu;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    public String getBlg() {
        return blg;
    }

    public void setBlg(String blg) {
        this.blg = blg;
    }
}
