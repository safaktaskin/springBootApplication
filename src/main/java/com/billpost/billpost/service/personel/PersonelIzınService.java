package com.billpost.billpost.service.personel;

import com.billpost.billpost.entity.personel.PersonelIzin;
import com.billpost.billpost.repository.personel.PersonelIzınRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * PersonelIzınService
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

@Service
public class PersonelIzınService {

    @Autowired
    PersonelIzınRepository personelIzınRepository;

    public List<PersonelIzin> findAllPersonelIzin() { return personelIzınRepository.findAll();
    }
}
