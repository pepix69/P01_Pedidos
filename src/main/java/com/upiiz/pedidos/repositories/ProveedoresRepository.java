package com.upiiz.pedidos.repositories;

import com.upiiz.pedidos.models.Proveedor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ProveedoresRepository {
    private List<Proveedor> proveedores = new ArrayList<>(); // Evitar NullPointerException
    private AtomicLong id = new AtomicLong();

    public List<Proveedor> obtenerProveedores() {
        return proveedores;
    }

    public Proveedor obtenerProveedorById(Long id) {
        return proveedores.stream()
                .filter(proveedor -> proveedor.getIdDeProveedor().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Proveedor guardarProveedor(Proveedor proveedor) {
        proveedor.setIdDeProveedor(id.incrementAndGet());
        proveedores.add(proveedor);
        return proveedor;
    }

    public void eliminarProveedor(Long id) {
        proveedores.removeIf(proveedor -> proveedor.getIdDeProveedor().equals(id));
    }

    public Proveedor actualizarProveedor(Proveedor proveedor) {
        eliminarProveedor(proveedor.getIdDeProveedor());
        proveedores.add(proveedor);
        return proveedor;
    }
}
