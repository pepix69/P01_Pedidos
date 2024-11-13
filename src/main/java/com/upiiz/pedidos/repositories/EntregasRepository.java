package com.upiiz.pedidos.repositories;

import com.upiiz.pedidos.models.Entrega;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class EntregasRepository {
    private List<Entrega> entregas = new ArrayList<>(); // Evitar NullPointerException
    private AtomicLong id = new AtomicLong();

    public List<Entrega> obtenerEntregas() {
        return entregas;
    }

    public Entrega obtenerEntregaById(Long id) {
        return entregas.stream()
                .filter(entrega -> entrega.getIdDeEntrega().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Entrega guardarEntrega(Entrega entrega) {
        entrega.setIdDeEntrega(id.incrementAndGet());
        entregas.add(entrega);
        return entrega;
    }

    public void eliminarEntrega(Long id) {
        entregas.removeIf(entrega -> entrega.getIdDeEntrega().equals(id));
    }

    public Entrega actualizarEntrega(Entrega entrega) {
        eliminarEntrega(entrega.getIdDeEntrega());
        entregas.add(entrega);
        return entrega;
    }
}
