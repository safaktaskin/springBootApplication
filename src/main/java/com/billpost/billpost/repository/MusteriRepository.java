package com.billpost.billpost.repository;

import com.billpost.billpost.entity.Musteri;
import org.springframework.stereotype.Repository;

/**
 * MusteriRepository
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

@Repository
public class MusteriRepository extends BaseRepository<Musteri> {

    public MusteriRepository() {
        super(Musteri.class);
    }
}
