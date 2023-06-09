package com.galenus.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Getter
@Setter
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String pagamento;
    private String hipDiagnostico;
    private String conduta;
    private String tratamento;
    private String histClinica;
    private String motivoCons;
    private String alergias;
    private String diagostico;
    private String doencasCron;
    private String medicoCrm;
    private Timestamp dataHora;
    private String pacienteDoc;
}