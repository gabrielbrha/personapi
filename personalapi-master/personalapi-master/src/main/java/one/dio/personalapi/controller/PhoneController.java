package one.dio.personalapi.controller;

import lombok.AllArgsConstructor;
import one.dio.personalapi.dto.request.PhoneDTO;
import one.dio.personalapi.dto.response.MessageResponseDTO;
import one.dio.personalapi.exception.PhoneNotFoundException;
import one.dio.personalapi.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/phone")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PhoneController {

    private PhoneService phoneService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPhone(@RequestBody @Valid PhoneDTO phoneDTO) {
        return phoneService.createPhone(phoneDTO);
    }

    @GetMapping
    public List<PhoneDTO> listAll() {
        return phoneService.listAll();
    }

    @GetMapping("/{id}")
    public PhoneDTO findById(@PathVariable Long id) throws PhoneNotFoundException {
        return phoneService.findById(id);
    }

    @PutMapping("/{id}")
    public MessageResponseDTO updateById(@PathVariable Long id, @RequestBody @Valid PhoneDTO phoneDTO) throws PhoneNotFoundException {
        return phoneService.updateById(id, phoneDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws PhoneNotFoundException {
        phoneService.delete(id);
    }
}