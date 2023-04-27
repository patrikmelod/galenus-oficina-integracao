package com.galenus.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class Agenda {

    private Integer id;
    private String docPaciente;
    private String telefone;
    private Timestamp dataHora;
    private String medicoCrm;
}
