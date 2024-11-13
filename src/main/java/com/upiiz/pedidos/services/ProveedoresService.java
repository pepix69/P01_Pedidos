package com.upiiz.pedidos.services;

import com.upiiz.pedidos.models.Proveedor;
import com.upiiz.pedidos.repositories.ProveedoresRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedoresService {
    private final ProveedoresRepository proveedoresRepository;

    public ProveedoresService(ProveedoresRepository proveedoresRepository) {
        this.proveedoresRepository = proveedoresRepository;
    }

    public List<Proveedor> getAllProveedores() {
        return proveedoresRepository.obtenerProveedores();
    }

    public Proveedor getProveedorById(Long id) {
        return proveedoresRepository.obtenerProveedorById(id);
    }

    public Proveedor createProveedor(Proveedor proveedor) {
        return proveedoresRepository.guardarProveedor(proveedor);
    }

    public Proveedor updateProveedor(Proveedor proveedor) {
        return proveedoresRepository.actualizarProveedor(proveedor);
    }

    public void deleteProveedor(Long id) {
        proveedoresRepository.eliminarProveedor(id);
    }
}
