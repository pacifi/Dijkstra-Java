package com.pacifi.entity;

import java.util.List;

public class Nodo {

    private Punto punto;

    private List<Arista> nodos;

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    public List<Arista> getNodos() {
        return nodos;
    }

    public void setNodos(List<Arista> nodos) {
        this.nodos = nodos;
    }
}
