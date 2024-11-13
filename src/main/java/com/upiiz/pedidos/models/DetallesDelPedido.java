package com.upiiz.pedidos.models;

public class DetallesDelPedido {
    private Long idDeDetallesDelPedido;
    private Long idDelProducto;
    private Long idDePedido;
    private Integer cantidadDeProducto;

    public DetallesDelPedido() {}

    public DetallesDelPedido(Long idDeDetallesDelPedido, Long idDelProducto, Long idDePedido, Integer cantidadDeProducto) {
        this.idDeDetallesDelPedido = idDeDetallesDelPedido;
        this.idDelProducto = idDelProducto;
        this.idDePedido = idDePedido;
        this.cantidadDeProducto = cantidadDeProducto;
    }

    public Long getIdDeDetallesDelPedido() {
        return idDeDetallesDelPedido;
    }

    public void setIdDeDetallesDelPedido(Long idDeDetallesDelPedido) {
        this.idDeDetallesDelPedido = idDeDetallesDelPedido;
    }

    public Long getIdDelProducto() {
        return idDelProducto;
    }

    public void setIdDelProducto(Long idDelProducto) {
        this.idDelProducto = idDelProducto;
    }

    public Long getIdDePedido() {
        return idDePedido;
    }

    public void setIdDePedido(Long idDePedido) {
        this.idDePedido = idDePedido;
    }

    public Integer getCantidadDeProducto() {
        return cantidadDeProducto;
    }

    public void setCantidadDeProducto(Integer cantidadDeProducto) {
        this.cantidadDeProducto = cantidadDeProducto;
    }
}
