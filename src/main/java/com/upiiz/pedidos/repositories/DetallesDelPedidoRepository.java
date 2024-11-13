package com.upiiz.pedidos.repositories;

import com.upiiz.pedidos.models.DetallesDelPedido;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class DetallesDelPedidoRepository {
    private List<DetallesDelPedido> detallesDelPedido = new ArrayList<>(); // Evitar NullPointerException
    private AtomicLong id = new AtomicLong();

    public List<DetallesDelPedido> obtenerDetallesDelPedido() {
        return detallesDelPedido;
    }

    public DetallesDelPedido obtenerDetalleDelPedidoById(Long id) {
        return detallesDelPedido.stream()
                .filter(detalle -> detalle.getIdDeDetallesDelPedido().equals(id))
                .findFirst()
                .orElse(null);
    }

    public DetallesDelPedido guardarDetalleDelPedido(DetallesDelPedido detalle) {
        detalle.setIdDeDetallesDelPedido(id.incrementAndGet());
        detallesDelPedido.add(detalle);
        return detalle;
    }

    public void eliminarDetalleDelPedido(Long id) {
        detallesDelPedido.removeIf(detalle -> detalle.getIdDeDetallesDelPedido().equals(id));
    }

    public DetallesDelPedido actualizarDetalleDelPedido(DetallesDelPedido detalle) {
        eliminarDetalleDelPedido(detalle.getIdDeDetallesDelPedido());
        detallesDelPedido.add(detalle);
        return detalle;
    }
}
