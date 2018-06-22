package com.pacifi.utils;

import com.pacifi.entity.Nodo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Util {

    public Map<String, Integer> cargarAristas(String id) {
        Map<String, Integer> nodos = new HashMap<String, Integer>();

        switch (id) {
            case "a": {
                nodos.put("b", 8);
                nodos.put("d", 5);
                nodos.put("e", 4);
            }
            break;
            case "b": {

                nodos.put("a", 8);
                nodos.put("c", 3);
                nodos.put("e", 12);
                nodos.put("f", 4);
            }
            break;
            case "c": {
                nodos.put("b", 3);
                nodos.put("f", 9);
                nodos.put("g", 11);
            }
            break;
            case "d": {
                nodos.put("a", 5);
                nodos.put("e", 9);
                nodos.put("h", 6);
            }
            break;
            case "e": {
                nodos.put("a", 4);
                nodos.put("b", 12);
                nodos.put("d", 9);
                nodos.put("f", 3);
                nodos.put("i", 8);
                nodos.put("j", 5);
            }
            break;
            case "f": {
                nodos.put("b", 4);
                nodos.put("c", 9);
                nodos.put("e", 3);
                nodos.put("g", 1);
                nodos.put("k", 8);
            }
            break;
            case "g": {
                nodos.put("c", 11);
                nodos.put("f", 1);
                nodos.put("k", 8);
                nodos.put("l", 7);
            }
            break;
            case "h": {
                nodos.put("d", 6);
                nodos.put("i", 2);
                nodos.put("m", 7);
            }
            break;
            case "i": {
                nodos.put("e", 8);
                nodos.put("h", 2);
                nodos.put("j", 10);
                nodos.put("m", 6);
            }
            break;
            case "j": {
                nodos.put("e", 5);
                nodos.put("i", 10);
                nodos.put("k", 6);
                nodos.put("n", 9);
            }
            break;
            case "k": {
                nodos.put("f", 8);
                nodos.put("g", 8);
                nodos.put("j", 6);
                nodos.put("l", 5);
                nodos.put("o", 7);
            }
            break;
            case "l": {
                nodos.put("g", 7);
                nodos.put("k", 5);
                nodos.put("o", 6);
            }
            break;
            case "m": {
                nodos.put("h", 7);
                nodos.put("i", 6);
                nodos.put("n", 2);
            }
            break;
            case "n": {
                nodos.put("j", 9);
                nodos.put("m", 2);
                nodos.put("o", 12);
            }
            break;
            case "o": {
                nodos.put("k", 7);
                nodos.put("l", 6);
                nodos.put("n", 12);
            }
            break;
        }

        return nodos;


    }

    public List<Nodo> crearGrafo() {
        //Crea el Grafo en completo
        String[] puntos = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"};
        List<Nodo> listaNodo = new ArrayList<>();
        Nodo nodo;
        for (String punto : puntos) {
            nodo = new Nodo();
            nodo.setId(punto);
            nodo.setNodos(cargarAristas(punto));
            listaNodo.add(nodo);
        }
        return listaNodo;
    }


    public void ListarNodos(List<Nodo> nodos) {
        System.out.println("===========================Nodos==========================");
        System.out.println("N, DT, DF, Nodos");
        for (Nodo nodo : nodos) {
            System.out.println(nodo.toString());
        }
    }

    public List<Nodo> nodoInicialFinal(List<Nodo> nodos, String idInicial, String idFinal) {

        for (Nodo nodo : nodos) {
            if (nodo.getId().equals(idInicial)) {
                nodo.setDistanciaFinal(0);
                nodo.setDistanciaTemporal(0);
                nodo.setNodoInicial(true);
            } else {
                nodo.setNodoInicial(false);
            }
            if (nodo.getId().equals(idFinal)) {

                nodo.setNodoFinal(true);
            } else {
                nodo.setNodoFinal(false);
            }


        }

        return nodos;
    }

    public boolean nodoNoReuelto(List<Nodo> nodos) {
        boolean bandera = true;
        for (Nodo nodo : nodos) {
            if (nodo.getDistanciaFinal() == Nodo.VALOR_COMPARACION) {
                return true;
            } else {
                bandera = false;
            }
        }
        return bandera;

    }

    public Nodo nodoInicial(List<Nodo> nodos) {
        for (Nodo nodo : nodos) {
            if (nodo.getNodoInicial() == true) {
                return nodo;
            }
        }
        return null;
    }

    public Nodo nodoFinal(List<Nodo> nodos) {
        for (Nodo nodo : nodos) {
            if (nodo.getNodoFinal() == true) {
                return nodo;
            }
        }
        return null;
    }

    public Nodo nodoSeleccion(List<Nodo> nodos, String id) {
        for (Nodo nodo : nodos) {
            if (nodo.getId().equals(id)) {

                return nodo;
            }
        }
        return null;
    }

    public Nodo temporalMenor(List<Nodo> nodos) {
        int valor = Nodo.VALOR_COMPARACION;
        Nodo nodoMinimo = new Nodo();
        for (Nodo nodo : nodos) {
            if (nodo.getDistanciaFinal() == Nodo.VALOR_COMPARACION && nodo.getDistanciaTemporal() < valor && nodo.getDistanciaFinal() != 0) {
                valor = nodo.getDistanciaTemporal();
                nodoMinimo = nodo;
            }
        }


        return nodoMinimo;

    }

    public List<Nodo> cambiarTemporalAFinal(List<Nodo> nodos, Nodo nodo) {
        for (Nodo no : nodos) {
            if (no.getId().equals(nodo.getId())) {
                no.setDistanciaFinal(nodo.getDistanciaTemporal());
            }
        }

        return nodos;
    }

    public List<Nodo> diskstra(List<Nodo> nodos) {
        Nodo nodoSeleccion = nodoInicial(nodos);

        while (nodoNoReuelto(nodos)) {
            for (Map.Entry<String, Integer> nodo : nodoSeleccion.getNodos().entrySet()) {
                Nodo nodoTemporal = nodoSeleccion(nodos, nodo.getKey());
                if (nodoTemporal.getDistanciaTemporal() == Nodo.VALOR_COMPARACION || (nodo.getValue() + nodoSeleccion.getDistanciaFinal() < nodoTemporal.getDistanciaTemporal() && nodoTemporal.getDistanciaFinal() == Nodo.VALOR_COMPARACION)) {
                    nodoTemporal.setDistanciaTemporal(nodo.getValue() + nodoSeleccion.getDistanciaFinal());
                }
            }
            Nodo nodo_minimo = temporalMenor(nodos);
            cambiarTemporalAFinal(nodos, nodo_minimo);
            nodoSeleccion = nodo_minimo;

        }


        return nodos;

    }

    public List<Nodo> caminoMinimo(List<Nodo> nodos) {
        List<Nodo> camino = new ArrayList<>();

        Nodo nodoInicial = nodoInicial(nodos);
        Nodo nodoFinal = nodoFinal(nodos);
        Nodo nodoSeleccion = nodoFinal;
        camino.add(nodoFinal);

        while (!nodoSeleccion.getId().equals(nodoInicial.getId())) {
            for (Map.Entry<String, Integer> nodo : nodoSeleccion.getNodos().entrySet()) {
                Nodo nodo_temporal = nodoSeleccion(nodos, nodo.getKey());
                if (nodo_temporal.getDistanciaFinal() == nodoSeleccion.getDistanciaFinal() - nodo.getValue()) {
                    camino.add(nodo_temporal);
                    nodoSeleccion = nodo_temporal;
                }
            }
        }

        return camino;
    }


}
