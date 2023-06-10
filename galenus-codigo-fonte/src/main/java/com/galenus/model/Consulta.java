package com.galenus.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class Consulta {

    private Integer id;
    private String conduta;
    private String tratamento;
    private String histClinica;
    private String sintomas;
    private String diagostico;
    private String doencasCron;
    private String medicoCrm;
    private Timestamp dataHora;
    private String pacienteDoc;
}