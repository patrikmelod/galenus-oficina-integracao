package com.galenus.process;

import com.galenus.dao.FuncionarioDAO;
import com.galenus.dao.LogDAO;
import com.galenus.model.Funcionario;
import com.galenus.model.Log;
import com.galenus.telas.Login;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class LoginProcess {

    private final LogDAO logDAO = new LogDAO();

    private final FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

    public void salvaLog() {
        Log login = new Log();
        login.setDataAcesso(new Timestamp(System.currentTimeMillis()));
        try {
            login.setIpMaquina(InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        logDAO.save(login);
    }

    public boolean validaLogin(String email, String senha) {
        Funcionario funcionario = funcionarioDAO.getByEmail(email);
        if (funcionario != null) {
            return funcionario.getSenha().equals(senha);
        }
        return false;
    }
}
