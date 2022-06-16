package com.billpost.billpost.converter.personel;

import com.billpost.billpost.dto.personel.PersonelDto;
import com.billpost.billpost.entity.personel.Personel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * PersonelConverter
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

@Component
public class PersonelConverter {

    public PersonelDto convertToPersonelDto(Personel personel) {
        PersonelDto personelDto = new PersonelDto();
        personelDto.setId(personel.getId());
        personelDto.setAdi(personel.getAdi());
        personelDto.setSoyadi(personel.getSoyadi());
        personelDto.setTc(personel.getTc());
        personelDto.setTel(personel.getTel());
        personelDto.setAdres(personel.getAdres());
        personelDto.setPersonelFotograf(personel.getPersonelFotograf());
        personelDto.setPersonelIzin(personel.getPersonelIzin());
        personelDto.setPersonelMaas(personel.getPersonelMaas());
        return personelDto;
    }

    public List<PersonelDto> convertToPersonelDtoList(List<Personel> personelList) {
        List<PersonelDto> personelDtoList = new ArrayList<>();
        for (Personel personel : personelList) {
            PersonelDto personelDto = convertToPersonelDto(personel);
            personelDtoList.add(personelDto);
        }
        return personelDtoList;
    }
    
}
