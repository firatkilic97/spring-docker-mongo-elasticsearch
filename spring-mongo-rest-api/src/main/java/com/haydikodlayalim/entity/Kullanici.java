package com.haydikodlayalim.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.HashMap;

@Document
@EnableMongoRepositories
public class Kullanici {

    @Id
    private String id;
    private String adi;
    private String soyadi;
    private HashMap ozellikler;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public HashMap getOzellikler() {
        return ozellikler;
    }

    public void setOzellikler(HashMap ozellikler) {
        this.ozellikler = ozellikler;
    }
}
