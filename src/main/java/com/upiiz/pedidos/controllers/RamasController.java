package com.upiiz.pedidos.controllers;

import com.upiiz.pedidos.models.Rama;
import com.upiiz.pedidos.services.RamasService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/ramas")
public class RamasController {
    private final RamasService ramasService;

    public RamasController(RamasService ramaService) {
        this.ramasService = ramaService;
    }

    @GetMapping
    public ResponseEntity<List<Rama>> getRamas() {
        return ResponseEntity.ok(ramasService.getAllRamas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rama> getRama(@PathVariable Long id) {
        return ResponseEntity.ok(ramasService.getRamaById(id));
    }

    @PostMapping
    public ResponseEntity<Rama> addRama(@RequestBody Rama rama) {
        return ResponseEntity.ok(ramasService.createRama(rama));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Rama> updateRama(@RequestBody Rama rama, @PathVariable Long id) {
        rama.setIdDeRama(id);
        return ResponseEntity.ok(ramasService.updateRama(rama));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRama(@PathVariable Long id) {
        ramasService.deleteRama(id);
        return ResponseEntity.noContent().build();
    }
}
