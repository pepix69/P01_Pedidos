package com.upiiz.pedidos.models;

public class SedeCentral {
    private Long idDeSedeCentral;
    private Long idDeRama;

    public SedeCentral() {}

    public SedeCentral(Long idDeSedeCentral, Long idDeRama) {
        this.idDeSedeCentral = idDeSedeCentral;
        this.idDeRama = idDeRama;
    }

    public Long getIdDeSedeCentral() {
        return idDeSedeCentral;
    }

    public void setIdDeSedeCentral(Long idDeSedeCentral) {
        this.idDeSedeCentral = idDeSedeCentral;
    }

    public Long getIdDeRama() {
        return idDeRama;
    }

    public void setIdDeRama(Long idDeRama) {
        this.idDeRama = idDeRama;
    }
}
