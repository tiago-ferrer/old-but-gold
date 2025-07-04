package br.com.fiap.susdemo.model;

import jakarta.persistence.Entity;

@Entity
public class Medico extends Pessoa{

    private String especialidade;
    private String registro;

    public Medico() {
        super();
    }

    public Medico(String cpf, String nome, String especialidade, String registro) {
        super(cpf, nome);
        this.especialidade = especialidade;
        this.registro = registro;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getRegistro() {
        return registro;
    }
}
