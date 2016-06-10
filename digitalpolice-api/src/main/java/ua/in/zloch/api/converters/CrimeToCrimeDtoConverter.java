package ua.in.zloch.api.converters;

import org.springframework.core.convert.converter.Converter;
import ua.in.zloch.api.dto.CrimeListDTO;
import ua.in.zloch.core.entity.Crime;

import java.util.List;

public class CrimeToCrimeDtoConverter implements Converter<List<Crime>, CrimeListDTO> {
    @Override
    public CrimeListDTO convert(List<Crime> crimeList) {
        CrimeListDTO dtoList = new CrimeListDTO();
        for (Crime crime : crimeList) {
            CrimeListDTO.CrimeDTO dto = new CrimeListDTO().new CrimeDTO();
            dto.setCoordinates(crime.getLongitude(), crime.getLatitude());
            dto.setId(crime.getId());
            dto.setDate(crime.getDate());
            dto.setCategoryId(crime.getCategory().getId());
            if (crime.getRegion() != null) {
                dto.setRegionName(crime.getRegion().getName());
                dto.setRegionKoatuu(crime.getRegion().getKoatuu());
            } else {
                dto.setRegionName("undefined");
                dto.setRegionKoatuu(0l);
            }

            dtoList.addFeature(dto);
        }
        return dtoList;
    }
}