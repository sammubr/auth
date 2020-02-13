package br.com.sammubr.auth.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class RecordsNotFoundException extends ResponseStatusException {

    private static final String NENHUM_REGISTRO_ENCONTRADO = "Nenhum registro encontrado";

    public RecordsNotFoundException() {
        super(HttpStatus.NOT_FOUND, NENHUM_REGISTRO_ENCONTRADO);
    }

    public RecordsNotFoundException(String message) {
        super(HttpStatus.NOT_FOUND, message);
    }
}
