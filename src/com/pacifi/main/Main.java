package com.pacifi.main;

import com.pacifi.entity.Nodo;
import com.pacifi.utils.Util;

import java.util.List;

public class Main {
    public static void main(String args[]) {
        Util util = new Util();


        List<Nodo> listaNodo = util.crearGrafo();
        listaNodo = util.nodoInicialFinal(listaNodo, "a", "o");

        listaNodo = util.diskstra(listaNodo);
        List<Nodo> ruta = util.caminoMinimo(listaNodo);

        util.ListarNodos(listaNodo);
        util.ListarNodos(ruta);


    }


}
