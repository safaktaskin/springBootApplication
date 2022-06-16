package com.billpost.billpost.converter.personel;

import com.billpost.billpost.dto.personel.PersonelMaasDto;
import com.billpost.billpost.entity.personel.PersonelMaas;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * PersonelMaasConverter
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

@Component
public class PersonelMaasConverter {

    public PersonelMaasDto convertToPersonelMaasDto(PersonelMaas personelMaas) {
        PersonelMaasDto personelMaasDto = new PersonelMaasDto();
        personelMaasDto.setId(personelMaas.getId());
        personelMaasDto.setPersonel(personelMaas.getPersonel());
        personelMaasDto.setPersonelIzin(personelMaas.getPersonelIzin());
        personelMaasDto.setMaas(personelMaas.getMaas());
        return personelMaasDto;
    }

    public List<PersonelMaasDto> convertToPersonelMaasDtoList(List<PersonelMaas> personelMaasList) {
        List<PersonelMaasDto> personelMaasDtoList = new ArrayList<>();
        for (PersonelMaas personelMaas : personelMaasList) {
            PersonelMaasDto personelMaasDto = convertToPersonelMaasDto(personelMaas);
            personelMaasDtoList.add(personelMaasDto);
        }
        return personelMaasDtoList;
    }
    
}
