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

            }
            break;
        }

        return nodos;


    }

    public List<Nodo> CrearNodos() {
        String[] toppings = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "o"};
        List<Nodo> listaNodo = new ArrayList<>();

        Nodo nodo;
        for (String item : toppings) {
            nodo = new Nodo();
            nodo.setId(item);
            nodo.setNodos(cargarAristas(item));

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
