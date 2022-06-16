package com.billpost.billpost.entity;

import javax.persistence.*;

/**
 * Musteri
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

@Entity
@Table(name = "MUSTERI")
public class Musteri {

    @Id
    @SequenceGenerator(name = "generator", sequenceName = "CITY_ID_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "generator", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String adi;

    @Column
    private String soyadi;

    @Column
    private String tel;

    @Column
    private String adres;

    @Column
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
