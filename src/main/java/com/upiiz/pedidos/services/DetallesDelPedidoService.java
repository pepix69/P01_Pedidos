package com.upiiz.pedidos.services;

import com.upiiz.pedidos.models.DetallesDelPedido;
import com.upiiz.pedidos.repositories.DetallesDelPedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallesDelPedidoService {
    private final DetallesDelPedidoRepository detallesDelPedidoRepository;

    public DetallesDelPedidoService(DetallesDelPedidoRepository detallesDelPedidoRepository) {
        this.detallesDelPedidoRepository = detallesDelPedidoRepository;
    }

    public List<DetallesDelPedido> getAllDetallesDelPedido() {
        return detallesDelPedidoRepository.obtenerDetallesDelPedido();
    }

    public DetallesDelPedido getDetalleDelPedidoById(Long id) {
        return detallesDelPedidoRepository.obtenerDetalleDelPedidoById(id);
    }

    public DetallesDelPedido createDetalleDelPedido(DetallesDelPedido detalle) {
        return detallesDelPedidoRepository.guardarDetalleDelPedido(detalle);
    }

    public DetallesDelPedido updateDetalleDelPedido(DetallesDelPedido detalle) {
        return detallesDelPedidoRepository.actualizarDetalleDelPedido(detalle);
    }

    public void deleteDetalleDelPedido(Long id) {
        detallesDelPedidoRepository.eliminarDetalleDelPedido(id);
    }
}
