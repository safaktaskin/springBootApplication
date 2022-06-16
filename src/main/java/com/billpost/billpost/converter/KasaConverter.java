package com.billpost.billpost.converter;

import com.billpost.billpost.dto.KasaDto;
import com.billpost.billpost.entity.Kasa;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * KasaConverter
 *
 * @author Şafak Taşkın
 * @since 1.0.0
 */

@Component
public class KasaConverter {

    public KasaDto convertToKasaDto(Kasa kasa) {
        KasaDto kasaDto = new KasaDto();
        kasaDto.setId(kasa.getId());
        kasaDto.setSatisTarihi(kasa.getSatisTarihi());
        kasaDto.setSatisYapilanMusteri(kasa.getSatisYapilanMusteri());
        kasaDto.setUrunAdeti(kasa.getUrunAdeti());
        kasaDto.setToplamCikanUrun(kasa.getToplamCikanUrun());
        kasaDto.setSeriNo(kasa.getSeriNo());
        kasaDto.setUrunTutari(kasa.getUrunTutari());
        return kasaDto;
    }

    public List<KasaDto> convertToKasaDtoList(List<Kasa> kasaList) {
        List<KasaDto> kasaDtoList = new ArrayList<>();
        for (Kasa kasa : kasaList) {
            KasaDto kasaDto = convertToKasaDto(kasa);
            kasaDtoList.add(kasaDto);
        }
        return kasaDtoList;
    }
    
}
