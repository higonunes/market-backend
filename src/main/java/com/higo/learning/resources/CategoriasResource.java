package com.higo.learning.resources;

import com.higo.learning.domain.Categoria;
import com.higo.learning.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriasResource {

    @Autowired
    private CategoriaService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> find(@PathVariable Integer id) {
        Categoria obj = service.buscar(id);

        return ResponseEntity.ok().body(obj);

    }
}