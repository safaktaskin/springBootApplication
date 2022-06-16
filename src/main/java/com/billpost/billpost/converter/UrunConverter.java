package com.billpost.billpost.converter;

import com.billpost.billpost.dto.UrunDto;
import com.billpost.billpost.entity.Urun;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * UrunConverter
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

@Component
public class UrunConverter {

    public UrunDto convertToUrunDto(Urun urun) {
        UrunDto urunDto = new UrunDto();
        urunDto.setId(urun.getId());
        urunDto.setAdi(urun.getAdi());
        urunDto.setFiyati(urun.getFiyati());
        return urunDto;
    }

    public List<UrunDto> convertToUrunDtoList(List<Urun> urunList) {
        List<UrunDto> urunDtoList = new ArrayList<>();
        for (Urun urun : urunList) {
            UrunDto urunDto = convertToUrunDto(urun);
            urunDtoList.add(urunDto);
        }
        return urunDtoList;
    }
}
