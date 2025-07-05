package br.com.fiap.susdemo.service.impl;

import br.com.fiap.susdemo.model.Medico;
import br.com.fiap.susdemo.repository.MedicoRepository;
import br.com.fiap.susdemo.service.MedicoService;
import org.springframework.stereotype.Service;

@Service
class MedicoServiceImpl implements MedicoService {

    private final MedicoRepository medicoRepository;

    MedicoServiceImpl(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    @Override
    public Medico save(Medico medico) {
        return this.medicoRepository.save(medico);
    }
}
