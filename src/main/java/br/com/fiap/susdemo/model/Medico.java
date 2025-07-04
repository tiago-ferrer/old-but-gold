package br.com.fiap.susdemo.model;

import jakarta.persistence.Entity;

@Entity
public class Medico extends Pessoa{

    private String especialidade;
    private String registro;
}
