package com.billpost.billpost.repository.personel;

import com.billpost.billpost.entity.personel.PersonelMaas;
import com.billpost.billpost.repository.BaseRepository;
import org.springframework.stereotype.Repository;

/**
 * PersonelMaasRepository
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

@Repository
public class PersonelMaasRepository extends BaseRepository<PersonelMaas> {

    public PersonelMaasRepository() {
        super(PersonelMaas.class);
    }
}
