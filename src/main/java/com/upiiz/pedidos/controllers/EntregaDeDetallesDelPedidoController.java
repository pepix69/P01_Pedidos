package com.upiiz.pedidos.controllers;

import com.upiiz.pedidos.models.EntregaDeDetallesDelPedido;
import com.upiiz.pedidos.services.EntregaDeDetallesDelPedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/entregas-detalles")
public class EntregaDeDetallesDelPedidoController {
    private final EntregaDeDetallesDelPedidoService entregaDeDetallesDelPedidoService;

    public EntregaDeDetallesDelPedidoController(EntregaDeDetallesDelPedidoService entregaDeDetallesDelPedidoService) {
        this.entregaDeDetallesDelPedidoService = entregaDeDetallesDelPedidoService;
    }

    @GetMapping
    public ResponseEntity<List<EntregaDeDetallesDelPedido>> getEntregasDetalles() {
        return ResponseEntity.ok(entregaDeDetallesDelPedidoService.getAllEntregasDetalles());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EntregaDeDetallesDelPedido> getEntregaDetalle(@PathVariable Long id) {
        return ResponseEntity.ok(entregaDeDetallesDelPedidoService.getEntregaDetalleById(id));
    }

    @PostMapping
    public ResponseEntity<EntregaDeDetallesDelPedido> addEntregaDetalle(@RequestBody EntregaDeDetallesDelPedido entregaDeDetallesDelPedido) {
        return ResponseEntity.ok(entregaDeDetallesDelPedidoService.createEntregaDetalle(entregaDeDetallesDelPedido));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EntregaDeDetallesDelPedido> updateEntregaDetalle(@RequestBody EntregaDeDetallesDelPedido entregaDeDetallesDelPedido, @PathVariable Long id) {
        entregaDeDetallesDelPedido.setIdDeDetallesDelPedido(id);
        return ResponseEntity.ok(entregaDeDetallesDelPedidoService.updateEntregaDetalle(entregaDeDetallesDelPedido));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEntregaDetalle(@PathVariable Long id) {
        entregaDeDetallesDelPedidoService.deleteEntregaDetalle(id);
        return ResponseEntity.noContent().build();
    }
}
