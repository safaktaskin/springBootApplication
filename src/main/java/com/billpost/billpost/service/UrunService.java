package com.billpost.billpost.service;

import com.billpost.billpost.entity.Urun;
import com.billpost.billpost.repository.UrunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UrunService
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

@Service
public class UrunService {

    @Autowired
    UrunRepository urunRepository;

    public List<Urun> findAllUrun() { return urunRepository.findAll();
    }
}
