package com.upiiz.pedidos.controllers;

import com.upiiz.pedidos.models.DetallesDelPedido;
import com.upiiz.pedidos.services.DetallesDelPedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/detalles-del-pedido")
public class DetallesDelPedidoController {
    private final DetallesDelPedidoService detallesDelPedidoService;

    public DetallesDelPedidoController(DetallesDelPedidoService detallesDelPedidoService) {
        this.detallesDelPedidoService = detallesDelPedidoService;
    }

    @GetMapping
    public ResponseEntity<List<DetallesDelPedido>> getDetallesDelPedido() {
        return ResponseEntity.ok(detallesDelPedidoService.getAllDetallesDelPedido());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetallesDelPedido> getDetalleDelPedido(@PathVariable Long id) {
        return ResponseEntity.ok(detallesDelPedidoService.getDetalleDelPedidoById(id));
    }

    @PostMapping
    public ResponseEntity<DetallesDelPedido> addDetalleDelPedido(@RequestBody DetallesDelPedido detalle) {
        return ResponseEntity.ok(detallesDelPedidoService.createDetalleDelPedido(detalle));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DetallesDelPedido> updateDetalleDelPedido(@RequestBody DetallesDelPedido detalle, @PathVariable Long id) {
        detalle.setIdDeDetallesDelPedido(id);
        return ResponseEntity.ok(detallesDelPedidoService.updateDetalleDelPedido(detalle));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDetalleDelPedido(@PathVariable Long id) {
        detallesDelPedidoService.deleteDetalleDelPedido(id);
        return ResponseEntity.noContent().build();
    }
}
