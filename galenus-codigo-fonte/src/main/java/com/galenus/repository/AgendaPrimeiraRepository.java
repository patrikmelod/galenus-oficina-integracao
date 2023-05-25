package com.galenus.repository;

import com.galenus.model.AgendaPrimeira;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaPrimeiraRepository extends JpaRepository<AgendaPrimeira, Integer> {
}
