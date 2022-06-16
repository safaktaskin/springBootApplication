package com.billpost.billpost.entity.personel;

import org.springframework.beans.factory.annotation.Qualifier;

import javax.persistence.*;
import java.util.Date;

/**
 * PersonelIzin
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */
@Entity
@Table(name = "PERSONEL_IZIN")
public class PersonelIzin {

    @Id
    @SequenceGenerator(name = "generator", sequenceName = "CITY_ID_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "generator", strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PERSONEL", foreignKey = @ForeignKey(name = "FK_PERSONEL_IZIN_PERSONEL", value = ConstraintMode.CONSTRAINT))
    private Personel personel;

    @Column
    private Long kullanilanIzin;

    @Column
    private Long kalanIzin;

    @Column
    private Long raporluGunSayisi;

    @Column
    private Date kullanilanIzinTarihleri;

    @Column
    private Long ucretliIzinKalanHak;

    @Column
    private Long ucretsizIzinKalanHak;

    @Column
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
