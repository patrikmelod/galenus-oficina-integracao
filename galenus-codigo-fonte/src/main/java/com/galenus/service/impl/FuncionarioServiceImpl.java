package com.galenus.service.impl;

import com.galenus.model.Funcionario;
import com.galenus.repository.FuncionarioRepository;
import com.galenus.service.FuncionarioService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("FuncionarioService")
@Transactional
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @Override
    public Funcionario findByEmail(String email) {
        return this.funcionarioRepository.findByEmail(email);
    }

    @Override
    public void save(Funcionario funcionario) {
        this.funcionarioRepository.save(funcionario);
    }

}
