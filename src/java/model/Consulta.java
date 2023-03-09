package java.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Consulta {

    private Integer id;
    private Date data_consult;
    private Date hora;
    private String medico_nome;
    private String medico_crm;
    private String paciente_nome;
    private String paciente_documento;
    private String sintomas;
    private String diagostico;
}