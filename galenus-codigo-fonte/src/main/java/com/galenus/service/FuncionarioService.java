package com.galenus.service;

import com.galenus.model.Funcionario;

public interface FuncionarioService {

    Funcionario findByEmail(String email);

    void save(Funcionario funcionario);
}
