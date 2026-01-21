package Structures.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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

    public Map<String, Integer> rankingPorPuntaje(List<String[]> entradas) {

        Map<String, Integer> mejoresPuntajes = new HashMap<>();

        for (String[] entrada : entradas) {
            String jugador = entrada[0];
            int puntaje = Integer.parseInt(entrada[1]);

            if (!mejoresPuntajes.containsKey(jugador)
                    || puntaje > mejoresPuntajes.get(jugador)) {
                mejoresPuntajes.put(jugador, puntaje);
            }
        }

        List<Map.Entry<String, Integer>> listaOrdenada =
                new ArrayList<>(mejoresPuntajes.entrySet());

        listaOrdenada.sort((a, b) -> b.getValue() - a.getValue());

        Map<String, Integer> ranking = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : listaOrdenada) {
            ranking.put(entry.getKey(), entry.getValue());
        }

        return ranking;
    }

    public void maximoPorCarrera(Map<String, Integer> datos) {
        Map<String, Integer> maxNotas = new HashMap<>();

        for (Map.Entry<String, Integer> entry : datos.entrySet()) {
            String clave = entry.getKey();
            Integer nota = entry.getValue();

            String carrera = clave.split("-")[0];

            maxNotas.put(carrera, Math.max(maxNotas.getOrDefault(carrera, 0), nota));
        }

        for (Map.Entry<String, Integer> entry : maxNotas.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
