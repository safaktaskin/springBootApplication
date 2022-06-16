package com.billpost.billpost.converter.personel;

import com.billpost.billpost.dto.personel.PersonelIzinDto;
import com.billpost.billpost.entity.personel.PersonelIzin;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * PersonelIzınConverter
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

@Component
public class PersonelIzınConverter {

    public PersonelIzinDto convertToPersonelIzinDto(PersonelIzin personelIzin) {
        PersonelIzinDto personelIzinDto = new PersonelIzinDto();
        personelIzinDto.setId(personelIzin.getId());
        personelIzinDto.setPersonel(personelIzin.getPersonel());
        personelIzinDto.setKullanilanIzin(personelIzin.getKullanilanIzin());
        personelIzinDto.setKalanIzin(personelIzin.getKalanIzin());
        personelIzinDto.setRaporluGunSayisi(personelIzin.getRaporluGunSayisi());
        personelIzinDto.setKullanilanIzinTarihleri(personelIzin.getKullanilanIzinTarihleri());
        personelIzinDto.setUcretliIzinKalanHak(personelIzin.getUcretliIzinKalanHak());
        personelIzinDto.setUcretsizIzinKalanHak(personelIzin.getUcretsizIzinKalanHak());
        personelIzinDto.setAciklama(personelIzin.getAciklama());
        return personelIzinDto;
    }

    public List<PersonelIzinDto> convertToPersonelIzinDtoList(List<PersonelIzin> personelIzinList) {
        List<PersonelIzinDto> personelIzinDtoList = new ArrayList<>();
        for (PersonelIzin personelIzin : personelIzinList) {
            PersonelIzinDto personelIzinDto = convertToPersonelIzinDto(personelIzin);
            personelIzinDtoList.add(personelIzinDto);
        }
        return personelIzinDtoList;
    }
}
