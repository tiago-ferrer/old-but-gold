package br.com.fiap.susdemo.dto;

import br.com.fiap.susdemo.model.Paciente;

public class PacienteDto {
    private String cpf,nome,doencaCronica;

    public PacienteDto() {
        super();
    }

    public PacienteDto(String cpf, String nome, String doencaCronica) {
        this.cpf = cpf;
        this.nome = nome;
        this.doencaCronica = doencaCronica;
    }

    public Paciente toEntity(){
        return new Paciente(cpf, nome, doencaCronica);
    }

    public static PacienteDto from(Paciente paciente){
        return new PacienteDto(paciente.getCpf(), paciente.getNome(), paciente.getDoencaCronica());
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDoencaCronica(String doencaCronica) {
        this.doencaCronica = doencaCronica;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getDoencaCronica() {
        return doencaCronica;
    }
}
