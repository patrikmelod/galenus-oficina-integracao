package com.galenus.model;

import jakarta.persistence.Entity;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "consulta", schema = "galenus")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String pagamento;
    private String hipDiagnostico;
    private String conduta;
    private String tratamento;
    private String hist_clinica;
    private String motivo_cons;
    private String alergias;
    private String diagostico;
    private String doencas_cron;
}