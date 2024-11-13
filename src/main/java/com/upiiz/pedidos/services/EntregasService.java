package com.upiiz.pedidos.services;

import com.upiiz.pedidos.models.Entrega;
import com.upiiz.pedidos.repositories.EntregasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntregasService {
    private final EntregasRepository entregasRepository;

    public EntregasService(EntregasRepository entregasRepository) {
        this.entregasRepository = entregasRepository;
    }

    public List<Entrega> getAllEntregas() {
        return entregasRepository.obtenerEntregas();
    }

    public Entrega getEntregaById(Long id) {
        return entregasRepository.obtenerEntregaById(id);
    }

    public Entrega createEntrega(Entrega entrega) {
        return entregasRepository.guardarEntrega(entrega);
    }

    public Entrega updateEntrega(Entrega entrega) {
        return entregasRepository.actualizarEntrega(entrega);
    }

    public void deleteEntrega(Long id) {
        entregasRepository.eliminarEntrega(id);
    }
}
