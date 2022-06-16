package com.billpost.billpost.repository;

import com.billpost.billpost.entity.Urun;
import org.springframework.stereotype.Repository;

/**
 * UrunRepository
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

@Repository
public class UrunRepository extends BaseRepository<Urun> {

    public UrunRepository() {
        super(Urun.class);
    }
}
