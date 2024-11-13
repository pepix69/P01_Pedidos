package com.upiiz.pedidos.controllers;

import com.upiiz.pedidos.models.Entrega;
import com.upiiz.pedidos.services.EntregasService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/entregas")
public class EntregasController {
    private final EntregasService entregasService;

    public EntregasController(EntregasService entregasService) {
        this.entregasService = entregasService;
    }

    @GetMapping
    public ResponseEntity<List<Entrega>> getEntregas() {
        return ResponseEntity.ok(entregasService.getAllEntregas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Entrega> getEntrega(@PathVariable Long id) {
        return ResponseEntity.ok(entregasService.getEntregaById(id));
    }

    @PostMapping
    public ResponseEntity<Entrega> addEntrega(@RequestBody Entrega entrega) {
        return ResponseEntity.ok(entregasService.createEntrega(entrega));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Entrega> updateEntrega(@RequestBody Entrega entrega, @PathVariable Long id) {
        entrega.setIdDeEntrega(id);
        return ResponseEntity.ok(entregasService.updateEntrega(entrega));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEntrega(@PathVariable Long id) {
        entregasService.deleteEntrega(id);
        return ResponseEntity.noContent().build();
    }
}
