package br.com.fiap.susdemo.controller;

import br.com.fiap.susdemo.dto.MedicoDto;
import br.com.fiap.susdemo.model.Medico;
import br.com.fiap.susdemo.service.MedicoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {


    private final MedicoService medicoService;


    public MedicoController(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    @PostMapping
    public ResponseEntity<MedicoDto> createMedico(@RequestBody MedicoDto medicoDto) {
        final Medico medico = this.medicoService.save(medicoDto.toEntity());
        return ResponseEntity.ok(new MedicoDto(medico.getCpf(),medico.getNome(),medico.getRegistroConselho()));
    }
}
