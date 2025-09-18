package br.com.fiap.susdemo.dto;

import br.com.fiap.susdemo.model.Medico;

public record MedicoDto(String cpf, String nome, String registroConselho) {

    public Medico toEntity() {
        return new Medico(cpf, nome, registroConselho);
    }
}