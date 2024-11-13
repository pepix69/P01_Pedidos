package com.upiiz.pedidos.models;

import java.util.Date;

public class Pedido {
    private Long idDePedido;
    private Date fechaDelPedido;
    private Long idDeSedeCentral;

    public Pedido() {}

    public Pedido(Long idDePedido, Date fechaDelPedido, Long idDeSedeCentral) {
        this.idDePedido = idDePedido;
        this.fechaDelPedido = fechaDelPedido;
        this.idDeSedeCentral = idDeSedeCentral;
    }

    public Long getIdDePedido() {
        return idDePedido;
    }

    public void setIdDePedido(Long idDePedido) {
        this.idDePedido = idDePedido;
    }

    public Date getFechaDelPedido() {
        return fechaDelPedido;
    }

    public void setFechaDelPedido(Date fechaDelPedido) {
        this.fechaDelPedido = fechaDelPedido;
    }

    public Long getIdDeSedeCentral() {
        return idDeSedeCentral;
    }

    public void setIdDeSedeCentral(Long idDeSedeCentral) {
        this.idDeSedeCentral = idDeSedeCentral;
    }
}
