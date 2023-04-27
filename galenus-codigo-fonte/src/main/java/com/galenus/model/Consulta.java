package com.galenus.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Consulta extends Agenda {

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