package com.galenus.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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