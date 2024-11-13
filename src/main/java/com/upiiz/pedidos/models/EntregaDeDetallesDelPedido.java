package com.upiiz.pedidos.models;

public class EntregaDeDetallesDelPedido {
    private Long idDeEntrega;
    private Long idDePedido;
    private Long idDeDetallesDelPedido;

    public EntregaDeDetallesDelPedido() {}

    public EntregaDeDetallesDelPedido(Long idDeEntrega, Long idDePedido, Long idDeDetallesDelPedido) {
        this.idDeEntrega = idDeEntrega;
        this.idDePedido = idDePedido;
        this.idDeDetallesDelPedido = idDeDetallesDelPedido;
    }

    public Long getIdDeEntrega() {
        return idDeEntrega;
    }

    public void setIdDeEntrega(Long idDeEntrega) {
        this.idDeEntrega = idDeEntrega;
    }

    public Long getIdDePedido() {
        return idDePedido;
    }

    public void setIdDePedido(Long idDePedido) {
        this.idDePedido = idDePedido;
    }

    public Long getIdDeDetallesDelPedido() {
        return idDeDetallesDelPedido;
    }

    public void setIdDeDetallesDelPedido(Long idDeDetallesDelPedido) {
        this.idDeDetallesDelPedido = idDeDetallesDelPedido;
    }
}
