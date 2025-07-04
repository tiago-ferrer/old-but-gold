package br.com.fiap.susdemo.model;

import jakarta.persistence.Entity;

@Entity
public class Paciente extends Pessoa{

    private String doencaCronica;
}
