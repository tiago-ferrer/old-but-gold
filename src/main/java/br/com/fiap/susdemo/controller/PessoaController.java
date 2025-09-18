package br.com.fiap.susdemo.controller;

import br.com.fiap.susdemo.dto.PessoaProjection;
import br.com.fiap.susdemo.service.PessoaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping
    public ResponseEntity<List<PessoaProjection>> getAllPessoas() {
        return ResponseEntity.ok(this.pessoaService.findAll());
    }

}
