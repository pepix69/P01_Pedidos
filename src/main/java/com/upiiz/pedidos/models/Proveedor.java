package com.upiiz.pedidos.models;

import java.util.Date;

public class Proveedor {
    private Long idDeProveedor;
    private Long idDeEntrega;
    private Date fechaDeEntrega;

    public Proveedor() {}

    public Proveedor(Long idDeProveedor, Long idDeEntrega, Date fechaDeEntrega) {
        this.idDeProveedor = idDeProveedor;
        this.idDeEntrega = idDeEntrega;
        this.fechaDeEntrega = fechaDeEntrega;
    }

    public Long getIdDeProveedor() {
        return idDeProveedor;
    }

    public void setIdDeProveedor(Long idDeProveedor) {
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
}

