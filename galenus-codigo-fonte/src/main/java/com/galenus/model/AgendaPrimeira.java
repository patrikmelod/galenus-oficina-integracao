package com.galenus.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
public class AgendaPrimeira implements Serializable {

    private Integer id;
    private String nomePaciente;
    private String telefone;
    private Timestamp dataHora;
    private String medicoCrm;
}
