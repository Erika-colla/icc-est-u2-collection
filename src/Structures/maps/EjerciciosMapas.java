package Structures.maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class EjerciciosMapas {
    public Map<Integer, Integer> contarDuplicados(List<Integer> list) {
        Map<Integer, Integer> conteo = new HashMap<>();

        for (Integer num : list) {
            conteo.put(num, conteo.getOrDefault(num, 0) + 1);
        }
        return conteo;
    }

    public Integer elementoNoRepetido(List<Integer> list) {
         Map<Integer, Integer> conteo = new HashMap<>();

         for (Integer num : list) {
             conteo.put(num, conteo.getOrDefault(num, 0) + 1);
         }

         for (Integer num : list) {
             if (conteo.get(num) == 1) {
                return num;   
             }
         }
         return null;
    }

    public void rankingPuntajes(Map<String, Integer> jugadores) {
        Map<String, Integer> mejores = new HashMap<>();

        for (Map.Entry<String, Integer> e : jugadores.entrySet()) {
            String name = e.getKey();
            int puntaje = e.getValue(); 

            if (!mejores.containsKey(name) || puntaje > mejores.get(name)) {
                mejores.put(name, puntaje);     
            }
        }

        TreeMap<String,Integer> ranking = new TreeMap<>();
    }
}
