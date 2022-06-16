package com.billpost.billpost.entity.personel;

import javax.persistence.*;

/**
 * PersonelFotograf
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

@Entity
@Table(name = "PERSONEL_FOTOGRAF")
public class PersonelFotograf {

    @Id
    @SequenceGenerator(name = "generator", sequenceName = "CITY_ID_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(generator = "generator", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Lob
    private byte[] content;

    @Column
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
