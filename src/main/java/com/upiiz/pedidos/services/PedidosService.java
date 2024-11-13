package com.upiiz.pedidos.services;

import com.upiiz.pedidos.models.Pedido;
import com.upiiz.pedidos.repositories.PedidosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidosService {
    private final PedidosRepository pedidosRepository;

    public PedidosService(PedidosRepository pedidosRepository) {
        this.pedidosRepository = pedidosRepository;
    }

    public List<Pedido> getAllPedidos() {
        return pedidosRepository.obtenerPedidos();
    }

    public Pedido getPedidoById(Long id) {
        return pedidosRepository.obtenerPedidoById(id);
    }

    public Pedido createPedido(Pedido pedido) {
        return pedidosRepository.guardarPedido(pedido);
    }

    public Pedido updatePedido(Pedido pedido) {
        return pedidosRepository.actualizarPedido(pedido);
    }

    public void deletePedido(Long id) {
        pedidosRepository.eliminarPedido(id);
    }
}
