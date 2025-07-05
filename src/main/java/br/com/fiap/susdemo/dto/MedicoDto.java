package br.com.fiap.susdemo.dto;

import br.com.fiap.susdemo.model.Medico;

public class MedicoDto {

    private String cpf, nome, especialidade, registro;

    public MedicoDto() {
        super();
    }

    public MedicoDto(String cpf, String nome, String especialidade, String registro) {
        this.cpf = cpf;
        this.nome = nome;
        this.especialidade = especialidade;
        this.registro = registro;
    }

    public static MedicoDto from(Medico savedMedico) {
        return new MedicoDto(savedMedico.getCpf(), savedMedico.getNome(), savedMedico.getEspecialidade(), savedMedico.getRegistro());
    }


    public Medico toEntity() {
        return new Medico(cpf, nome, especialidade, registro);
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getRegistro() {
        return registro;
    }
}
