package com.exemplo.escola.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.exemplo.escola.model.Nota;
import com.exemplo.escola.repository.NotaRepository;

@RestController
@RequestMapping("/notas")
public class NotaController {
    @Autowired
    private NotaRepository notaRepository;

    @GetMapping
    public List<Nota> listar() {
        return notaRepository.findAll();
    }

    @PostMapping
    public Nota criar(@RequestBody Nota nota) {
        return notaRepository.save(nota);
    }

    @PutMapping("/{id}")
    public Nota atualizar(@PathVariable Long id, @RequestBody Nota nota) {
        nota.setId(id);
        return notaRepository.save(nota);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        notaRepository.deleteById(id);
    }
}

