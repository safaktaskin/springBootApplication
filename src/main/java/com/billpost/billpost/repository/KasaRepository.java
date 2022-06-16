package com.billpost.billpost.repository;

import com.billpost.billpost.entity.Kasa;
import org.springframework.stereotype.Repository;

/**
 * KasaRepository
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

@Repository
public class KasaRepository extends BaseRepository<Kasa> {

    public KasaRepository() {
        super(Kasa.class);
    }

}
