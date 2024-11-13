package com.upiiz.pedidos.services;

import com.upiiz.pedidos.models.Producto;
import com.upiiz.pedidos.repositories.ProductosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosService {
    private final ProductosRepository productosRepository;

    public ProductosService(ProductosRepository productosRepository) {
        this.productosRepository = productosRepository;
    }

    public List<Producto> getAllProductos() {
        return productosRepository.obtenerProductos();
    }

    public Producto getProductoById(Long id) {
        return productosRepository.obtenerProductoById(id);
    }

    public Producto createProducto(Producto producto) {
        return productosRepository.guardarProducto(producto);
    }

    public Producto updateProducto(Producto producto) {
        return productosRepository.actualizarProducto(producto);
    }

    public void deleteProducto(Long id) {
        productosRepository.eliminarProducto(id);
    }
}
