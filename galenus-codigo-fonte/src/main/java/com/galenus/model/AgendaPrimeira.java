package com.galenus.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class AgendaPrimeira {

    private Integer id;
    private String nomePaciente;
    private String telefone;
    private Timestamp dataHora;
    private String medicoCrm;
}
