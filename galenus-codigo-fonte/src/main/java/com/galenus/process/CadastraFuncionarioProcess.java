package com.galenus.process;

import com.galenus.dao.FuncionarioDAO;
import com.galenus.model.Funcionario;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

@Component
public class CadastraFuncionarioProcess {

    private final FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    public void saveFuncionario(Funcionario funcionario) {
        funcionarioDAO.save(funcionario);
    }
}
