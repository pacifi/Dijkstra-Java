package com.pacifi.utils;

import com.pacifi.entity.Punto;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public List<Punto> CrearPuntos() {
        String[] toppings = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "o"};
        List<Punto> listaPunto = new ArrayList<>();
        Punto punto;
        for (String item : toppings) {
            punto = new Punto();
            punto.setId(item);
            listaPunto.add(punto);
        }
        return listaPunto;
    }
}
