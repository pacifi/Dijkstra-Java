package com.pacifi.main;

import com.pacifi.entity.Nodo;
import com.pacifi.utils.Util;

import java.util.List;

public class Main {
    public static void main(String args[]) {
        Util util = new Util();


        List<Nodo> listaNodo = util.CrearNodos();
        util.ListarNodos(listaNodo);

    }


}
