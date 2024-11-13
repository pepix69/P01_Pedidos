package com.upiiz.pedidos.controllers;

import com.upiiz.pedidos.models.SedeCentral;
import com.upiiz.pedidos.services.SedesCentralesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sedes")
public class SedesCentralesController {
    private final SedesCentralesService sedeCentralService;

    public SedesCentralesController(SedesCentralesService sedeCentralService) {
        this.sedeCentralService = sedeCentralService;
    }

    @GetMapping
    public ResponseEntity<List<SedeCentral>> getSedes() {
        return ResponseEntity.ok(sedeCentralService.getAllSedesCentrales());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SedeCentral> getSede(@PathVariable Long id) {
        return ResponseEntity.ok(sedeCentralService.getSedeCentralById(id));
    }

    @PostMapping
    public ResponseEntity<SedeCentral> addSede(@RequestBody SedeCentral sedeCentral) {
        return ResponseEntity.ok(sedeCentralService.createSedeCentral(sedeCentral));
    }

    @PutMapping("/{id}")
    public ResponseEntity<SedeCentral> updateSede(@RequestBody SedeCentral sedeCentral, @PathVariable Long id) {
        sedeCentral.setIdDeSedeCentral(id);
        return ResponseEntity.ok(sedeCentralService.updateSedeCentral(sedeCentral));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSede(@PathVariable Long id) {
        sedeCentralService.deleteSedeCentral(id);
        return ResponseEntity.noContent().build();
    }
}
