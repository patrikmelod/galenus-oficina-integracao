package com.galenus.process;

import com.galenus.model.Funcionario;
import com.galenus.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CadastraFuncionarioProcess {

    @Autowired
    private FuncionarioService funcionarioService;

    public void saveFuncionario(Funcionario funcionario) {
        funcionarioService.save(funcionario);
    }
}
