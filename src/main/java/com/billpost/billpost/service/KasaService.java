package com.billpost.billpost.service;

import com.billpost.billpost.entity.Kasa;
import com.billpost.billpost.repository.KasaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * KasaService
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

@Service
public class KasaService {
    
    @Autowired
    KasaRepository kasaRepository;

    public List<Kasa> findAllKasa() {
        return kasaRepository.findAll();
    }
}
