package com.billpost.billpost.converter;

import com.billpost.billpost.dto.MusteriDto;
import com.billpost.billpost.entity.Musteri;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * MusteriConverter
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

@Component
public class MusteriConverter {

    public MusteriDto convertToMusteriDto(Musteri musteri) {
        MusteriDto musteriDto = new MusteriDto();
        musteriDto.setId(musteri.getId());
        musteriDto.setAdi(musteri.getAdi());
        musteriDto.setSoyadi(musteri.getSoyadi());
        musteriDto.setTel(musteri.getTel());
        musteriDto.setSiparisPlatformu(musteri.getSiparisPlatformu());
        musteriDto.setAdres(musteri.getAdres());
        return musteriDto;
    }

    public List<MusteriDto> convertToMusteriDtoList(List<Musteri> musteriList) {
        List<MusteriDto> musteriDtoList = new ArrayList<>();
        for (Musteri musteri : musteriList) {
            MusteriDto musteriDto = convertToMusteriDto(musteri);
            musteriDtoList.add(musteriDto);
        }
        return musteriDtoList;
    }
}
