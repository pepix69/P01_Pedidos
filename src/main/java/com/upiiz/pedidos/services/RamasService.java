package com.upiiz.pedidos.services;

import com.upiiz.pedidos.models.Rama;
import com.upiiz.pedidos.repositories.RamasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RamasService {
    private final RamasRepository ramasRepository;

    public RamasService(RamasRepository ramasRepository) {
        this.ramasRepository = ramasRepository;
    }

    public List<Rama> getAllRamas() {
        return ramasRepository.obtenerRamas();
    }

    public Rama getRamaById(Long id) {
        return ramasRepository.obtenerRamaById(id);
    }

    public Rama createRama(Rama rama) {
        return ramasRepository.guardarRama(rama);
    }

    public Rama updateRama(Rama rama) {
        return ramasRepository.actualizarRama(rama);
    }

    public void deleteRama(Long id) {
        ramasRepository.eliminarRama(id);
    }
}
