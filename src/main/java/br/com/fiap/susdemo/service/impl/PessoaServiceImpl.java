package br.com.fiap.susdemo.service.impl;

import br.com.fiap.susdemo.dto.PessoaProjection;
import br.com.fiap.susdemo.model.Pessoa;
import br.com.fiap.susdemo.repository.PessoaRepository;
import br.com.fiap.susdemo.service.PessoaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class PessoaServiceImpl implements PessoaService {

    private final PessoaRepository pessoaRepository;

    PessoaServiceImpl(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @Override
    public List<PessoaProjection> findAll() {
        return this.pessoaRepository.findAllProjection();
    }
}
