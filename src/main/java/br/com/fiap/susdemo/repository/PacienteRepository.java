package br.com.fiap.susdemo.repository;

import br.com.fiap.susdemo.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, String> {
}