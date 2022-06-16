package com.billpost.billpost.dto.personel;

import com.billpost.billpost.entity.personel.Personel;

import java.util.Date;

/**
 * PersonelIzinDto
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

public class PersonelIzinDto {

    private Long id;
    private Personel personel;
    private Long kullanilanIzin;
    private Long kalanIzin;
    private Long raporluGunSayisi;
    private Date kullanilanIzinTarihleri;
    private Long ucretliIzinKalanHak;
    private Long ucretsizIzinKalanHak;
    private String aciklama;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Personel getPersonel() {
        return personel;
    }

    public void setPersonel(Personel personel) {
        this.personel = personel;
    }

    public Long getKullanilanIzin() {
        return kullanilanIzin;
    }

    public void setKullanilanIzin(Long kullanilanIzin) {
        this.kullanilanIzin = kullanilanIzin;
    }

    public Long getKalanIzin() {
        return kalanIzin;
    }

    public void setKalanIzin(Long kalanIzin) {
        this.kalanIzin = kalanIzin;
    }

    public Long getRaporluGunSayisi() {
        return raporluGunSayisi;
    }

    public void setRaporluGunSayisi(Long raporluGunSayisi) {
        this.raporluGunSayisi = raporluGunSayisi;
    }

    public Date getKullanilanIzinTarihleri() {
        return kullanilanIzinTarihleri;
    }

    public void setKullanilanIzinTarihleri(Date kullanilanIzinTarihleri) {
        this.kullanilanIzinTarihleri = kullanilanIzinTarihleri;
    }

    public Long getUcretliIzinKalanHak() {
        return ucretliIzinKalanHak;
    }

    public void setUcretliIzinKalanHak(Long ucretliIzinKalanHak) {
        this.ucretliIzinKalanHak = ucretliIzinKalanHak;
    }

    public Long getUcretsizIzinKalanHak() {
        return ucretsizIzinKalanHak;
    }

    public void setUcretsizIzinKalanHak(Long ucretsizIzinKalanHak) {
        this.ucretsizIzinKalanHak = ucretsizIzinKalanHak;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
