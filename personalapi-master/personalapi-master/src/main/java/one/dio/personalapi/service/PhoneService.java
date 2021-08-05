package one.dio.personalapi.service;

import lombok.AllArgsConstructor;
import one.dio.personalapi.dto.request.PhoneDTO;
import one.dio.personalapi.dto.response.MessageResponseDTO;
import one.dio.personalapi.entity.Phone;
import one.dio.personalapi.exception.PhoneNotFoundException;
import one.dio.personalapi.mapper.PhoneMapper;
import one.dio.personalapi.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PhoneService {

    private PhoneRepository phoneRepository;

    private final PhoneMapper phoneMapper = PhoneMapper.INSTANCE;

    public MessageResponseDTO createPhone(PhoneDTO phoneDTO) {
        Phone phoneToSave = phoneMapper.toModel(phoneDTO);

        Phone savedPhone = phoneRepository.save(phoneToSave);
        return createMessageResponse(savedPhone.getId(), "Created phone with ID ");
    }

    public List<PhoneDTO> listAll() {
        List<Phone> allPeople = phoneRepository.findAll();
        return allPeople.stream()
                .map(phoneMapper::toDTO)
                .collect(Collectors.toList());
    }

    public PhoneDTO findById(Long id) throws PhoneNotFoundException {
        Phone phone = verifyIfExists(id);

        return phoneMapper.toDTO(phone);
    }

    public void delete(Long id) throws PhoneNotFoundException {
        verifyIfExists(id);
        phoneRepository.deleteById(id);
    }

    public MessageResponseDTO updateById(Long id, PhoneDTO phoneDTO) throws PhoneNotFoundException {
        verifyIfExists(id);

        Phone phoneToUpdate = phoneMapper.toModel(phoneDTO);

        Phone updatedPhone = phoneRepository.save(phoneToUpdate);
        return createMessageResponse(updatedPhone.getId(), "Updated Phone with ID ");
    }

    private Phone verifyIfExists(Long id) throws PhoneNotFoundException {
        return phoneRepository.findById(id)
                .orElseThrow(() -> new PhoneNotFoundException(id));
    }

    private MessageResponseDTO createMessageResponse(Long id, String message) {
        return MessageResponseDTO
                .builder()
                .message(message + id)
                .build();
    }
}