package br.com.sammubr.auth.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Origin {

    @NotNull
    private String host;

    @NotNull
    private int port;

    @NotNull
    private String database;

    @NotNull
    private String user;

    @NotNull
    private String password;

    @NotNull
    private OriginType type;

}
