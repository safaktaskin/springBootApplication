package com.billpost.billpost.entity.personel;

import javax.persistence.*;

/**
 * Personel
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

@Entity
@Table(name = "PERSONEL")
public class Personel {

    @Id
    @SequenceGenerator(name = "generator", sequenceName = "CITY_ID_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "generator", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String adi;

    @Column
    private String soyadi;

    @Column
    private String tc;

    @Column
    private String tel;

    @Column
    private String adres;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PERSONEL_FOTOGRAF", foreignKey = @ForeignKey(name = "FK_PERSONEL_PERSONEL_FOTOGRAF", value = ConstraintMode.CONSTRAINT))
    private PersonelFotograf personelFotograf;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PERSONEL_IZIN", foreignKey = @ForeignKey(name = "FK_PERSONEL_PERSONEL_IZIN", value = ConstraintMode.CONSTRAINT))
    private PersonelIzin personelIzin;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PERSONEL_MAAS", foreignKey = @ForeignKey(name = "FK_PERSONEL_PERSONEL_MAAS", value = ConstraintMode.CONSTRAINT))
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
