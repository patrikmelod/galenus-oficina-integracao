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
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "funcionario", schema = "galenus")
public class Funcionario {

    @Id
    private String documento;

    @Column(name = "nome")
    private String nome;

    @Column(name = "nascimento")
    private Date nascimento;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    @Column(name = "endereco")
    private String endereco;
}
