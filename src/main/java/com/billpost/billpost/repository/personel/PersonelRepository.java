package com.billpost.billpost.repository.personel;

import com.billpost.billpost.entity.personel.Personel;
import com.billpost.billpost.repository.BaseRepository;
import org.springframework.stereotype.Repository;

/**
 * PersonelRepository
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

@Repository
public class PersonelRepository extends BaseRepository<Personel> {

    public PersonelRepository() {
        super(Personel.class);
    }
}
