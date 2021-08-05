package one.dio.personalapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PhoneNotFoundException extends Exception {

    public PhoneNotFoundException(Long id) {
        super("phone not found with ID " + id);
    }
}