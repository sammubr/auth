package br.com.sammubr.auth.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class UnauthorizedException extends ResponseStatusException {

    public UnauthorizedException() {
        super(HttpStatus.UNAUTHORIZED, "Não autorizado");
    }
}
