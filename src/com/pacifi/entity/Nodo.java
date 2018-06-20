package com.pacifi.entity;

import java.util.List;

public class Nodo {

    private Punto punto;
    private int distanciaTemporal;
    private int distanciaFinal;
    private List<Arista> nodos;

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    public int getDistanciaTemporal() {
        return distanciaTemporal;
    }

    public void setDistanciaTemporal(int distanciaTemporal) {
        this.distanciaTemporal = distanciaTemporal;
    }

    public int getDistanciaFinal() {
        return distanciaFinal;
    }

    public void setDistanciaFinal(int distanciaFinal) {
        this.distanciaFinal = distanciaFinal;
    }

    public List<Arista> getNodos() {
        return nodos;
    }

    public void setNodos(List<Arista> nodos) {
        this.nodos = nodos;
    }

}
