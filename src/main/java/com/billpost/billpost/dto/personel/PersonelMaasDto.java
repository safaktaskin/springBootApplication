package com.billpost.billpost.dto.personel;

import com.billpost.billpost.entity.personel.Personel;
import com.billpost.billpost.entity.personel.PersonelIzin;

import java.math.BigDecimal;

/**
 * PersonelMaasDto
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

public class PersonelMaasDto {

    private Long id;
    private Personel personel;
    private PersonelIzin personelIzin;
    private BigDecimal maas;

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

    public PersonelIzin getPersonelIzin() {
        return personelIzin;
    }

    public void setPersonelIzin(PersonelIzin personelIzin) {
        this.personelIzin = personelIzin;
    }

    public BigDecimal getMaas() {
        return maas;
    }

    public void setMaas(BigDecimal maas) {
        this.maas = maas;
    }
}
