package com.upiiz.pedidos.services;

import com.upiiz.pedidos.models.EntregaDeDetallesDelPedido;
import com.upiiz.pedidos.repositories.EntregaDeDetallesDelPedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntregaDeDetallesDelPedidoService {
    private final EntregaDeDetallesDelPedidoRepository entregaDeDetallesDelPedidoRepository;

    public EntregaDeDetallesDelPedidoService(EntregaDeDetallesDelPedidoRepository entregaDeDetallesDelPedidoRepository) {
        this.entregaDeDetallesDelPedidoRepository = entregaDeDetallesDelPedidoRepository;
    }

    public List<EntregaDeDetallesDelPedido> getAllEntregasDetalles() {
        return entregaDeDetallesDelPedidoRepository.obtenerEntregasDetalles();
    }

    public EntregaDeDetallesDelPedido getEntregaDetalleById(Long id) {
        return entregaDeDetallesDelPedidoRepository.obtenerEntregaDetalleById(id);
    }

    public EntregaDeDetallesDelPedido createEntregaDetalle(EntregaDeDetallesDelPedido entrega) {
        return entregaDeDetallesDelPedidoRepository.guardarEntregaDetalle(entrega);
    }

    public EntregaDeDetallesDelPedido updateEntregaDetalle(EntregaDeDetallesDelPedido entrega) {
        return entregaDeDetallesDelPedidoRepository.actualizarEntregaDetalle(entrega);
    }

    public void deleteEntregaDetalle(Long id) {
        entregaDeDetallesDelPedidoRepository.eliminarEntregaDetalle(id);
    }
}
