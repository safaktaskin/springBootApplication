package com.billpost.billpost.dto;

import java.math.BigDecimal;

/**
 * UrunDto
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

public class UrunDto {

    private Long id;
    private String adi;
    private BigDecimal fiyati;

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

    public BigDecimal getFiyati() {
        return fiyati;
    }

    public void setFiyati(BigDecimal fiyati) {
        this.fiyati = fiyati;
    }
}
