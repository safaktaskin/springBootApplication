package com.billpost.billpost.service.personel;

import com.billpost.billpost.entity.personel.PersonelMaas;
import com.billpost.billpost.repository.personel.PersonelMaasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * PersonelMaas
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

@Service
public class PersonelMaasService {

    @Autowired
    PersonelMaasRepository personelMaasRepository;

    public List<PersonelMaas> findAllPersonelMaas() { return personelMaasRepository.findAll();

    }
}
