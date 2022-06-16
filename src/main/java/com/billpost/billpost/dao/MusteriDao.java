package com.billpost.billpost.dao;

import com.billpost.billpost.entity.Musteri;
import com.billpost.billpost.repository.BaseRepository;

/**
 * MusteriDao
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

public class MusteriDao extends BaseRepository<Musteri> {

    public MusteriDao(Class<Musteri> t) {
        super(t);
    }
}
