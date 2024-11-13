package com.upiiz.pedidos.repositories;

import com.upiiz.pedidos.models.Rama;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class RamasRepository {
    private List<Rama> ramas = new ArrayList<>(); // Evitar NullPointerException
    private AtomicLong id = new AtomicLong();

    public List<Rama> obtenerRamas() {
        return ramas;
    }

    public Rama obtenerRamaById(Long id) {
        return ramas.stream()
                .filter(rama -> rama.getIdDeRama().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Rama guardarRama(Rama rama) {
        rama.setIdDeRama(id.incrementAndGet());
        ramas.add(rama);
        return rama;
    }

    public void eliminarRama(Long id) {
        ramas.removeIf(rama -> rama.getIdDeRama().equals(id));
    }

    public Rama actualizarRama(Rama rama) {
        eliminarRama(rama.getIdDeRama());
        ramas.add(rama);
        return rama;
    }
}
