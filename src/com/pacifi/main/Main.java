package com.pacifi.main;

import com.pacifi.entity.Nodo;
import com.pacifi.entity.Punto;
import com.pacifi.utils.Util;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        Util util = new Util();


        List<Punto> listaPuntos = util.CrearPuntos();
        System.out.println(listaPuntos);


    }


}
