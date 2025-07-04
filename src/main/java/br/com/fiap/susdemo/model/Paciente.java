package br.com.fiap.susdemo.model;

import jakarta.persistence.Entity;

@Entity
public class Paciente extends Pessoa {

    private String doencaCronica;

    public Paciente() {
        super();
    }

    public Paciente(String cpf, String nome, String doencaCronica) {
        super(cpf, nome);
        this.doencaCronica = doencaCronica;
    }

    public String getDoencaCronica() {
        return doencaCronica;
    }
}
