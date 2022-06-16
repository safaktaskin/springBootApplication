package com.billpost.billpost.dto;

import com.billpost.billpost.entity.Musteri;

import java.math.BigDecimal;
import java.util.Date;

/**
 * KasaDto
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

public class KasaDto {

    private Long id;
    private Musteri satisYapilanMusteri;
    private Long urunAdeti;
    private BigDecimal urunTutari;
    private Long toplamCikanUrun;
    private Long seriNo;
    private Date satisTarihi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Musteri getSatisYapilanMusteri() {
        return satisYapilanMusteri;
    }

    public void setSatisYapilanMusteri(Musteri satisYapilanMusteri) {
        this.satisYapilanMusteri = satisYapilanMusteri;
    }

    public Long getUrunAdeti() {
        return urunAdeti;
    }

    public void setUrunAdeti(Long urunAdeti) {
        this.urunAdeti = urunAdeti;
    }

    public BigDecimal getUrunTutari() {
        return urunTutari;
    }

    public void setUrunTutari(BigDecimal urunTutari) {
        this.urunTutari = urunTutari;
    }

    public Long getToplamCikanUrun() {
        return toplamCikanUrun;
    }

    public void setToplamCikanUrun(Long toplamCikanUrun) {
        this.toplamCikanUrun = toplamCikanUrun;
    }

    public Long getSeriNo() {
        return seriNo;
    }

    public void setSeriNo(Long seriNo) {
        this.seriNo = seriNo;
    }

    public Date getSatisTarihi() {
        return satisTarihi;
    }

    public void setSatisTarihi(Date satisTarihi) {
        this.satisTarihi = satisTarihi;
    }
}
