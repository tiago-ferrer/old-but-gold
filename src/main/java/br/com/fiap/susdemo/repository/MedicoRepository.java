package br.com.fiap.susdemo.repository;

import br.com.fiap.susdemo.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, String> {
}