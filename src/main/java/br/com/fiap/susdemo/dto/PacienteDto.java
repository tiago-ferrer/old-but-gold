package br.com.fiap.susdemo.dto;

import br.com.fiap.susdemo.model.Paciente;

public record PacienteDto(String cpf, String nome, String doencaCronica) {
    public Paciente toEntity() {
        return new Paciente(cpf,nome,doencaCronica);
    }
}