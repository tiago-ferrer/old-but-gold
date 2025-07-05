package br.com.fiap.susdemo.service;

import br.com.fiap.susdemo.dto.PessoaProjection;
import br.com.fiap.susdemo.model.Pessoa;

import java.util.List;

public interface PessoaService {
    List<PessoaProjection> findAll();
}
