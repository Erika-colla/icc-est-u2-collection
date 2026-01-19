package Structures.controller;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import Structures.models.Maquina;

public class MaquinaController {

    public Set<Maquina> ordenarPerSubred(List<Maquina> maquinas) {
        Set<Maquina> maquinasO = new TreeSet<>();
        for (Maquina maquina : maquinas) {
            maquinasO.add(maquinas);
        }
        return maquinasO;
    }
}
