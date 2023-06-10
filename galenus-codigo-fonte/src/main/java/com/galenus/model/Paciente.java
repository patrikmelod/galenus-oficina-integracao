package com.galenus.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class Paciente {

    private String documento;
    private String nome;
    private Date nascimento;
    private String sexo;
    private String telefone;
    private String endereco;
}
