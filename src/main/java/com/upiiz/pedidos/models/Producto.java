package com.upiiz.pedidos.models;

public class Producto {
    private Long idDelProducto;
    private Long idDeProveedor;

    public Producto() {}

    public Producto(Long idDelProducto, Long idDeProveedor) {
        this.idDelProducto = idDelProducto;
        this.idDeProveedor = idDeProveedor;
    }

    public Long getIdDelProducto() {
        return idDelProducto;
    }

    public void setIdDelProducto(Long idDelProducto) {
        this.idDelProducto = idDelProducto;
    }

    public Long getIdDeProveedor() {
        return idDeProveedor;
    }

    public void setIdDeProveedor(Long idDeProveedor) {
        this.idDeProveedor = idDeProveedor;
    }
}
