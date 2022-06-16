package com.billpost.billpost.dto.personel;

import com.billpost.billpost.entity.personel.PersonelFotograf;
import com.billpost.billpost.entity.personel.PersonelIzin;
import com.billpost.billpost.entity.personel.PersonelMaas;

/**
 * PersonelDto
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

public class PersonelDto {

    private Long id;
    private String adi;
    private String soyadi;
    private String tc;
    private String tel;
    private String adres;
    private PersonelFotograf personelFotograf;
    private PersonelIzin personelIzin;
    private PersonelMaas personelMaas;

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

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
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

    public PersonelFotograf getPersonelFotograf() {
        return personelFotograf;
    }

    public void setPersonelFotograf(PersonelFotograf personelFotograf) {
        this.personelFotograf = personelFotograf;
    }

    public PersonelIzin getPersonelIzin() {
        return personelIzin;
    }

    public void setPersonelIzin(PersonelIzin personelIzin) {
        this.personelIzin = personelIzin;
    }

    public PersonelMaas getPersonelMaas() {
        return personelMaas;
    }

    public void setPersonelMaas(PersonelMaas personelMaas) {
        this.personelMaas = personelMaas;
    }
}
