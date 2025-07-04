package br.com.fiap.susdemo.controller;

import br.com.fiap.susdemo.dto.PacienteDto;
import br.com.fiap.susdemo.model.Paciente;
import br.com.fiap.susdemo.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    private final PacienteService  pacienteService;

    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @PostMapping
    public ResponseEntity<PacienteDto> createPaciente(PacienteDto pacienteDto) {
        final Paciente savedPaciente = pacienteService.save(pacienteDto.toEntity());
        return ResponseEntity.ok(PacienteDto.from(savedPaciente));
    }
}
