package com.billpost.billpost.dto;

/**
 * MusteriDto
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

public class MusteriDto {

    private Long id;
    private String adi;
    private String soyadi;
    private String tel;
    private String adres;
    private String siparisPlatformu;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getSiparisPlatformu() {
        return siparisPlatformu;
    }

    public void setSiparisPlatformu(String siparisPlatformu) {
        this.siparisPlatformu = siparisPlatformu;
    }
}
