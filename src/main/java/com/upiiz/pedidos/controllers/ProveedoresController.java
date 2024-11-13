package com.upiiz.pedidos.controllers;

import com.upiiz.pedidos.models.Proveedor;
import com.upiiz.pedidos.services.ProveedoresService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/proveedores")
public class ProveedoresController {
    private final ProveedoresService proveedoresService;

    public ProveedoresController(ProveedoresService proveedoresService) {
        this.proveedoresService = proveedoresService;
    }

    @GetMapping
    public ResponseEntity<List<Proveedor>> getProveedores() {
        return ResponseEntity.ok(proveedoresService.getAllProveedores());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Proveedor> getProveedor(@PathVariable Long id) {
        return ResponseEntity.ok(proveedoresService.getProveedorById(id));
    }

    @PostMapping
    public ResponseEntity<Proveedor> addProveedor(@RequestBody Proveedor proveedor) {
        return ResponseEntity.ok(proveedoresService.createProveedor(proveedor));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Proveedor> updateProveedor(@RequestBody Proveedor proveedor, @PathVariable Long id) {
        proveedor.setIdDeProveedor(id);
        return ResponseEntity.ok(proveedoresService.updateProveedor(proveedor));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProveedor(@PathVariable Long id) {
        proveedoresService.deleteProveedor(id);
        return ResponseEntity.noContent().build();
    }
}
