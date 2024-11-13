package com.upiiz.pedidos.repositories;

import com.upiiz.pedidos.models.Pedido;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class PedidosRepository {
    private List<Pedido> pedidos = new ArrayList<>(); // Evitar NullPointerException
    private AtomicLong id = new AtomicLong();

    public List<Pedido> obtenerPedidos() {
        return pedidos;
    }

    public Pedido obtenerPedidoById(Long id) {
        return pedidos.stream()
                .filter(pedido -> pedido.getIdDePedido().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Pedido guardarPedido(Pedido pedido) {
        pedido.setIdDePedido(id.incrementAndGet());
        pedidos.add(pedido);
        return pedido;
    }

    public void eliminarPedido(Long id) {
        pedidos.removeIf(pedido -> pedido.getIdDePedido().equals(id));
    }

    public Pedido actualizarPedido(Pedido pedido) {
        eliminarPedido(pedido.getIdDePedido());
        pedidos.add(pedido);
        return pedido;
    }
}
