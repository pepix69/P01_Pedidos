package com.upiiz.pedidos.controllers;

import com.upiiz.pedidos.models.Pedido;
import com.upiiz.pedidos.services.PedidosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pedidos")
public class PedidosController {
    private final PedidosService pedidosService;

    public PedidosController(PedidosService pedidosService) {
        this.pedidosService = pedidosService;
    }

    @GetMapping
    public ResponseEntity<List<Pedido>> getPedidos() {
        return ResponseEntity.ok(pedidosService.getAllPedidos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> getPedido(@PathVariable Long id) {
        return ResponseEntity.ok(pedidosService.getPedidoById(id));
    }

    @PostMapping
    public ResponseEntity<Pedido> addPedido(@RequestBody Pedido pedido) {
        return ResponseEntity.ok(pedidosService.createPedido(pedido));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pedido> updatePedido(@RequestBody Pedido pedido, @PathVariable Long id) {
        pedido.setIdDePedido(id);
        return ResponseEntity.ok(pedidosService.updatePedido(pedido));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePedido(@PathVariable Long id) {
        pedidosService.deletePedido(id);
        return ResponseEntity.noContent().build();
    }
}
