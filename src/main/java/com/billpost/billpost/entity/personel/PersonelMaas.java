package com.billpost.billpost.entity.personel;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * PersonelMaas
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

@Entity
@Table(name = "PERSONEL_MAAS")
public class PersonelMaas {

    @Id
    @SequenceGenerator(name = "generator", sequenceName = "CITY_ID_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "generator", strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PERSONEL", foreignKey = @ForeignKey(name = "FK_PERS_MAAS_PERS", value = ConstraintMode.CONSTRAINT))
    private Personel personel;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PERSONEL_IZIN", foreignKey = @ForeignKey(name = "FK_PERS_MAAS_PERS_IZIN", value = ConstraintMode.CONSTRAINT))
    private PersonelIzin personelIzin;

    @Column
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
