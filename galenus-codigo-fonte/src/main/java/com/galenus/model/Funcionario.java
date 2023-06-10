package com.galenus.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class Funcionario {

    private String documento;
    private String nome;
    private Date nascimento;
    private String telefone;
    private String email;
    private String senha;
    private String endereco;
    private Medico medico;
}
