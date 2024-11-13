package com.upiiz.pedidos.services;

import com.upiiz.pedidos.models.SedeCentral;
import com.upiiz.pedidos.repositories.SedesCentralesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SedesCentralesService {
    private final SedesCentralesRepository sedesCentralesRepository;

    public SedesCentralesService(SedesCentralesRepository sedesCentralesRepository) {
        this.sedesCentralesRepository = sedesCentralesRepository;
    }

    public List<SedeCentral> getAllSedesCentrales() {
        return sedesCentralesRepository.obtenerSedesCentrales();
    }

    public SedeCentral getSedeCentralById(Long id) {
        return sedesCentralesRepository.obtenerSedeCentralById(id);
    }

    public SedeCentral createSedeCentral(SedeCentral sede) {
        return sedesCentralesRepository.guardarSedeCentral(sede);
    }

    public SedeCentral updateSedeCentral(SedeCentral sede) {
        return sedesCentralesRepository.actualizarSedeCentral(sede);
    }

    public void deleteSedeCentral(Long id) {
        sedesCentralesRepository.eliminarSedeCentral(id);
    }
}
