package br.com.fiap.susdemo.service.impl;

import br.com.fiap.susdemo.model.Paciente;
import br.com.fiap.susdemo.repository.PacienteRepository;
import br.com.fiap.susdemo.service.PacienteService;
import org.springframework.stereotype.Service;

@Service
class PacienteServiceImpl implements PacienteService {

    private final PacienteRepository pacienteRepository;

    PacienteServiceImpl(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    @Override
    public Paciente save(Paciente paciente) {
        return this.pacienteRepository.save(paciente);
    }
}
