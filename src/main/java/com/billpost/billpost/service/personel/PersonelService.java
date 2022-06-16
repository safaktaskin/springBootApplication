package com.billpost.billpost.service.personel;

import com.billpost.billpost.entity.personel.Personel;
import com.billpost.billpost.repository.personel.PersonelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * PersonelService
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

@Service
public class PersonelService {

    @Autowired
    PersonelRepository personelRepository;

    public List<Personel> findAllPersonel() { return personelRepository.findAll();
    }
}
