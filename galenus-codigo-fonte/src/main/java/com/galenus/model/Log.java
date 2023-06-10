package com.galenus.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class Log {

    private Integer id;
    private String ipMaquina;
    private Timestamp dataAcesso;
    private String funcDoc;
}
