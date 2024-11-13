package com.upiiz.pedidos.repositories;

import com.upiiz.pedidos.models.SedeCentral;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class SedesCentralesRepository {
    private List<SedeCentral> sedesCentrales = new ArrayList<>(); // Evitar NullPointerException
    private AtomicLong id = new AtomicLong();

    public List<SedeCentral> obtenerSedesCentrales() {
        return sedesCentrales;
    }

    public SedeCentral obtenerSedeCentralById(Long id) {
        return sedesCentrales.stream()
                .filter(sede -> sede.getIdDeSedeCentral().equals(id))
                .findFirst()
                .orElse(null);
    }

    public SedeCentral guardarSedeCentral(SedeCentral sede) {
        sede.setIdDeSedeCentral(id.incrementAndGet());
        sedesCentrales.add(sede);
        return sede;
    }

    public void eliminarSedeCentral(Long id) {
        sedesCentrales.removeIf(sede -> sede.getIdDeSedeCentral().equals(id));
    }

    public SedeCentral actualizarSedeCentral(SedeCentral sede) {
        eliminarSedeCentral(sede.getIdDeSedeCentral());
        sedesCentrales.add(sede);
        return sede;
    }
}
