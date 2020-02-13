package br.com.sammubr.auth.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class UpdateEntityIdDiferentException extends ResponseStatusException {

    private static final String PARA_ATUALIZAR_UM_REGISTRO_E_NECESSARIO_QUE_O_ID_DA_ENTIDADE_E_DA_REQUISICAO_SEJAM_IGUAIS = "Para atualizar um registro é necessário que o ID da entidade e da requisição sejam iguais";

    public UpdateEntityIdDiferentException() {
        super(HttpStatus.BAD_REQUEST, PARA_ATUALIZAR_UM_REGISTRO_E_NECESSARIO_QUE_O_ID_DA_ENTIDADE_E_DA_REQUISICAO_SEJAM_IGUAIS);
    }
}
