package com.billpost.billpost.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Kasa
 *
 * @author Şafak Taşkın
 * @since 5.286
 */

@Entity
@Table(name = "KASA")
public class Kasa {

    @Id
    @SequenceGenerator(name = "generator", sequenceName = "CITY_ID_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "generator", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private Date satisTarihi;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MUSTERI", foreignKey = @ForeignKey(name = "FK_KASA_MUSTERI", value = ConstraintMode.CONSTRAINT))
    private Musteri satisYapilanMusteri;

    @Column
    private Long urunAdeti;

    @Column
    private BigDecimal urunTutari;

    @Column
    private Long toplamCikanUrun;

    @Column
    private Long seriNo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getSatisTarihi() {
        return satisTarihi;
    }

    public void setSatisTarihi(Date satisTarihi) {
        this.satisTarihi = satisTarihi;
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
}
