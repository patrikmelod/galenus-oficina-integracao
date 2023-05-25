package com.galenus.model;

import jakarta.persistence.Entity;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "paciente", schema = "galenus")
public class Paciente {

    @Id
    private String documento;
    
    private String nome;
    private Integer idade;
    private char sexo;
    private String telefone;
    private String endereco;
}
