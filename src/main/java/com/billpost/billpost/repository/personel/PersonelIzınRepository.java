package com.billpost.billpost.repository.personel;

import com.billpost.billpost.entity.personel.PersonelIzin;
import com.billpost.billpost.repository.BaseRepository;
import org.springframework.stereotype.Repository;

/**
 * PersonelIzınRepository
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

@Repository
public class PersonelIzınRepository extends BaseRepository<PersonelIzin> {

    public PersonelIzınRepository() {
        super(PersonelIzin.class);
    }
}
