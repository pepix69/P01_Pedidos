package com.upiiz.pedidos.repositories;

import com.upiiz.pedidos.models.EntregaDeDetallesDelPedido;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class EntregaDeDetallesDelPedidoRepository {
    private List<EntregaDeDetallesDelPedido> entregasDetalles = new ArrayList<>(); // Evitar NullPointerException
    private AtomicLong id = new AtomicLong();

    public List<EntregaDeDetallesDelPedido> obtenerEntregasDetalles() {
        return entregasDetalles;
    }

    public EntregaDeDetallesDelPedido obtenerEntregaDetalleById(Long id) {
        return entregasDetalles.stream()
                .filter(entrega -> entrega.getIdDeEntrega().equals(id))
                .findFirst()
                .orElse(null);
    }

    public EntregaDeDetallesDelPedido guardarEntregaDetalle(EntregaDeDetallesDelPedido entrega) {
        entrega.setIdDeEntrega(id.incrementAndGet());
        entregasDetalles.add(entrega);
        return entrega;
    }

    public void eliminarEntregaDetalle(Long id) {
        entregasDetalles.removeIf(entrega -> entrega.getIdDeEntrega().equals(id));
    }

    public EntregaDeDetallesDelPedido actualizarEntregaDetalle(EntregaDeDetallesDelPedido entrega) {
        eliminarEntregaDetalle(entrega.getIdDeEntrega());
        entregasDetalles.add(entrega);
        return entrega;
    }
}
