package com.upiiz.pedidos.models;

import java.util.Date;

public class Entrega {
    private Long idDeEntrega;
    private Date fechaDeEntrega;
    private Long idDeProveedor;

    public Entrega() {}

    public Entrega(Long idDeEntrega, Date fechaDeEntrega, Long idDeProveedor) {
        this.idDeEntrega = idDeEntrega;
        this.fechaDeEntrega = fechaDeEntrega;
        this.idDeProveedor = idDeProveedor;
    }

    public Long getIdDeEntrega() {
        return idDeEntrega;
    }

    public void setIdDeEntrega(Long idDeEntrega) {
        this.idDeEntrega = idDeEntrega;
    }

    public Date getFechaDeEntrega() {
        return fechaDeEntrega;
    }

    public void setFechaDeEntrega(Date fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }

    public Long getIdDeProveedor() {
        return idDeProveedor;
    }

    public void setIdDeProveedor(Long idDeProveedor) {
        this.idDeProveedor = idDeProveedor;
    }
}
