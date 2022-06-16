package com.billpost.billpost.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Urun
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

@Entity
@Table(name= "URUN")
public class Urun {

    @Id
    @SequenceGenerator(name = "generator", sequenceName = "CITY_ID_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "generator", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String adi;

    @Column
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
