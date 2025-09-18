package br.com.fiap.susdemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Medico extends Pessoa {

    @Column(nullable = false)
    private String registroConselho;

    public Medico() {
        super();
    }

    public Medico(String cpf, String nome, String registroConselho) {
        super(cpf,nome);
        this.registroConselho = registroConselho;
    }

    public String getRegistroConselho() {
        return registroConselho;
    }
}