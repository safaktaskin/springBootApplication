package com.billpost.billpost.service;

import com.billpost.billpost.converter.MusteriConverter;
import com.billpost.billpost.dto.MusteriDto;
import com.billpost.billpost.entity.Musteri;
import com.billpost.billpost.repository.MusteriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * MusteriService
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

@Service
public class MusteriService {

    @Autowired
    MusteriRepository musteriRepository;

    public List<Musteri> findAllMusteri() {
        return musteriRepository.findAll();
    }
}
