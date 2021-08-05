package one.dio.personalapi.mapper;

import javax.annotation.processing.Generated;
import one.dio.personalapi.dto.request.PhoneDTO;
import one.dio.personalapi.entity.Phone;
import one.dio.personalapi.entity.Phone.PhoneBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-03T03:24:27-0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.11 (AdoptOpenJDK)"
)
public class PhoneMapperImpl implements PhoneMapper {

    @Override
    public Phone toModel(PhoneDTO personDTO) {
        if ( personDTO == null ) {
            return null;
        }

        PhoneBuilder phone = Phone.builder();

        phone.id( personDTO.getId() );
        phone.type( personDTO.getType() );
        phone.number( personDTO.getNumber() );

        return phone.build();
    }

    @Override
    public PhoneDTO toDTO(Phone person) {
        if ( person == null ) {
            return null;
        }

        PhoneDTO phoneDTO = new PhoneDTO();

        phoneDTO.setId( person.getId() );
        phoneDTO.setType( person.getType() );
        phoneDTO.setNumber( person.getNumber() );

        return phoneDTO;
    }
}
