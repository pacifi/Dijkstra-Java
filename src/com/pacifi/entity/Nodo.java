package com.pacifi.entity;

import java.util.List;
import java.util.Map;

public class Nodo {

    private String id;
    private int distanciaTemporal;
    private int distanciaFinal;
    Map<String, Integer> nodos;

    public Map<String, Integer> getNodos() {
        return nodos;
    }

    public void setNodos(Map<String, Integer> nodos) {
        this.nodos = nodos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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


    public String toString() {
        return (this.getId() + " " + this.getDistanciaTemporal() + " " + this.distanciaFinal + " nodos:" + this.getNodos())
                ;
    }
}
