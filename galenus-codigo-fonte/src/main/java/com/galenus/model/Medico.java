package com.galenus.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Medico extends Funcionario {

    private String crm;
    private String especialidade;
}
