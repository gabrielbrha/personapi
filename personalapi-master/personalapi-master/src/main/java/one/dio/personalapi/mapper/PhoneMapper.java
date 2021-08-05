package one.dio.personalapi.mapper;

import one.dio.personalapi.dto.request.PhoneDTO;
import one.dio.personalapi.entity.Phone;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper
public interface PhoneMapper {

    PhoneMapper INSTANCE = Mappers.getMapper((PhoneMapper.class));

    Phone toModel(PhoneDTO personDTO);

    PhoneDTO toDTO(Phone person);
}