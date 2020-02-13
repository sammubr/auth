package br.com.sammubr.auth.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class UpdateEntityIdNullException extends ResponseStatusException {

    private static final String PARA_ATUALIZAR_UM_REGISTRO_E_NECESSARIO_INFORMAR_UM_ID = "Para atualizar um registro é necessário informar um ID";

    public UpdateEntityIdNullException() {
        super(HttpStatus.BAD_REQUEST, PARA_ATUALIZAR_UM_REGISTRO_E_NECESSARIO_INFORMAR_UM_ID);
    }
}
