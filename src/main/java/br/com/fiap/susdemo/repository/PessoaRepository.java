package br.com.fiap.susdemo.repository;

import br.com.fiap.susdemo.dto.PessoaProjection;
import br.com.fiap.susdemo.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PessoaRepository extends JpaRepository<Pessoa, String> {

    @Query("SELECT p FROM Pessoa p")
    List<PessoaProjection> findAllProjection();
}
