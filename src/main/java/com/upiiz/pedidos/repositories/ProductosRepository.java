package com.upiiz.pedidos.repositories;

import com.upiiz.pedidos.models.Producto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ProductosRepository {
    private List<Producto> productos = new ArrayList<>(); // Evitar NullPointerException
    private AtomicLong id = new AtomicLong();

    public List<Producto> obtenerProductos() {
        return productos;
    }

    public Producto obtenerProductoById(Long id) {
        return productos.stream()
                .filter(producto -> producto.getIdDelProducto().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Producto guardarProducto(Producto producto) {
        producto.setIdDelProducto(id.incrementAndGet());
        productos.add(producto);
        return producto;
    }

    public void eliminarProducto(Long id) {
        productos.removeIf(producto -> producto.getIdDelProducto().equals(id));
    }

    public Producto actualizarProducto(Producto producto) {
        eliminarProducto(producto.getIdDelProducto());
        productos.add(producto);
        return producto;
    }
}
