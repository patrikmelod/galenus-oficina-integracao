package com.galenus.process;

import com.galenus.model.Funcionario;
import com.galenus.model.Log;
import com.galenus.service.FuncionarioService;
import com.galenus.service.LogService;
import com.galenus.service.impl.FuncionarioServiceImpl;
import com.galenus.service.impl.LogServiceImpl;
import com.galenus.telas.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class LoginProcess {

    @Autowired
    private LogService logService;

    @Autowired
    private FuncionarioService funcionarioService;

    public void salvaLog() {
        Log login = new Log();
        login.setDataAcesso(new Timestamp(System.currentTimeMillis()));
        try {
            login.setIpMaquina(InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        logService.save(login);
    }

    public boolean validaLogin(String email, String senha) {
        Funcionario funcionario = funcionarioService.findByEmail(email);
        if (funcionario != null) {
            return funcionario.getSenha().equals(senha);
        }
        return false;
    }
}
