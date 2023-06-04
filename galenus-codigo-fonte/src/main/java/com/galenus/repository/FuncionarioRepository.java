package com.galenus.repository;

import com.galenus.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, String> {
    
    Funcionario findByEmail(String email);

}
