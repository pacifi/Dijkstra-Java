package com.pacifi.entity;

import java.util.List;
import java.util.Map;

public class Nodo {

    private String id;
    private int distanciaTemporal;
    private int distanciaFinal;
    private boolean nodoInicial;
    private boolean nodoFinal;

    public static int VALOR_COMPARACION = 1000000000;

    public boolean getNodoInicial() {
        return nodoInicial;
    }

    public void setNodoInicial(boolean nodoInicial) {
        this.nodoInicial = nodoInicial;
    }

    public boolean getNodoFinal() {
        return nodoFinal;
    }

    public void setNodoFinal(boolean nodoFinal) {
        this.nodoFinal = nodoFinal;
    }

    Map<String, Integer> nodos;

    public Nodo() {
        this.distanciaTemporal = VALOR_COMPARACION;
        this.distanciaFinal = VALOR_COMPARACION;
        this.nodoInicial = false;
        this.nodoFinal = false;
    }

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
        return (this.getId() + " " + this.getDistanciaFinal() + " " + this.getDistanciaTemporal() + " nodos:"
                + this.getNodos() + ((this.getNodoInicial() == true) ? "Nodo Inicial" : "") + ((this.getNodoFinal() == true) ? "Nodo Final" : ""))
                ;
    }
}
