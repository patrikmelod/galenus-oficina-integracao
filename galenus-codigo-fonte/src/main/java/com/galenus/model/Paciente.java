package com.galenus.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Paciente {

    private String documento;
    private String nome;
    private Integer idade;
    private char sexo;
    private String telefone;
    private String endereco;
}
