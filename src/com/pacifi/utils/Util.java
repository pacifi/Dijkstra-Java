package com.pacifi.utils;

import com.pacifi.entity.Nodo;
import com.pacifi.entity.Punto;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public List<Nodo> CrearNodos() {
        String[] toppings = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "o"};
        List<Nodo> listaNodo = new ArrayList<>();
        Punto punto;
        Nodo nodo;
        for (String item : toppings) {
            punto = new Punto();
            punto.setId(item);
            nodo = new Nodo();
            nodo.setPunto(punto);

            listaNodo.add(nodo);
        }
        return listaNodo;
    }

    public void ListarNodos(List<Nodo> nodos) {
        System.out.println("===========================Nodos==========================");
        for (Nodo nodo : nodos) {
            System.out.println(nodo.toString());
        }
    }

}
