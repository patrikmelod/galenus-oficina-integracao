package com.galenus.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
public class Agenda implements Serializable {

    private Integer id;
    private String docPaciente;
    private String telefone;
    private Timestamp dataHora;
    private String medicoCrm;
    private String pagamento;
}
