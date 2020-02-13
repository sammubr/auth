package br.com.sammubr.auth.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class GenericException extends ResponseStatusException {

    public GenericException(String message) {
        super(HttpStatus.BAD_REQUEST, message);
    }
}
