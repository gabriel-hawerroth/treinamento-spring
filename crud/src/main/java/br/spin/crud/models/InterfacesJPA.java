package br.spin.crud.models;

import java.time.LocalDate;

public class InterfacesJPA {

    public interface RetornoAtendimentoSQLNativo {

        Integer getId();
        String getDt_atendimento();
        String getNome_paciente();
        String getDt_nascimento();
        String getNome_unidade();

    }

    public interface AtendimentosPaciente {
        Integer getId_atendimento();
        String getDt_atendimento();
        String getNome_unidade();
    }

}
