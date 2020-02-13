package br.com.sammubr.auth.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Integration {

    @NotNull
    private Origin origin;

}
