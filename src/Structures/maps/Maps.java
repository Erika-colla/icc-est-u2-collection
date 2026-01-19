package Structures.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import Structures.models.Person;

public class Maps {
    public Map<String, Integer>contruirHashMap(){
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 2);
        hashMap.put("B", 3);
        hashMap.put("A", 5);
        hashMap.put("C", 50);
        hashMap.put("D", 5);
        hashMap.put("F", 3);
        hashMap.put("G", 8);
        hashMap.put("H", 85);
        hashMap.put("I", 5);
        hashMap.size();
        for (int i = 0; i < hashMap.size(); i++) {
            //hashMap.values();
            System.out.println(hashMap.values().toArray()[i]);
        }
        for (String key : hashMap.keySet()) {
            System.out.println("Clave: " + key + ", Valor: " + hashMap.get(key));
        }
        return  hashMap;


    }
    public Map<String, Integer>LinkedHashMap() {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("A", 2);
        linkedHashMap.put("B", 3);
        linkedHashMap.put("A", 5);
        linkedHashMap.put("C", 50);
        linkedHashMap.put("D", 5);
        linkedHashMap.put("F", 3);
        linkedHashMap.put("G", 8);
        linkedHashMap.put("H", 85);
        linkedHashMap.put("I", 5);
        System.out.println(linkedHashMap.values());
        System.out.println(linkedHashMap.keySet());


        return linkedHashMap;
    }
    public Map<String, Integer>personaTreeMap() {
        Map<String, Integer> treeMap = new HashMap<>();
        treeMap.put("B", 3);
        treeMap.put("C", 50);
        treeMap.put("A", 2);
        treeMap.put("I", 5);
        treeMap.put("F", 3);
        treeMap.put("D", 5);
        treeMap.put("G", 8);
        treeMap.put("H", 85);
        treeMap.put("A", 5);
        System.out.println(treeMap.values());
        System.out.println(treeMap.keySet());
        return treeMap;
    }

    public Map<Person, Integer> contruirTreeMap() {
        Map<Person, Integer> treePerson= new HashMap<>();
            treePerson.put(new Person("Carlos", 23),1000);
            treePerson.put(new Person("Ana", 30),2000);
            treePerson.put(new Person("Luis", 18),3000);
            treePerson.put(new Person("Ana", 20),4000);
            treePerson.put(new Person("Andres", 23),5000);
            treePerson.put(new Person("Luis", 18),6000);
        return treePerson;
    }

    public void printFilter(Map<Person, Integer> mapaPersonas) {
        for (Map.Entry<Person, Integer> entrada : mapaPersonas.entrySet()) {
            Person p = entrada.getKey();
            Integer valor = entrada.getValue();

            System.out.println("Clave: " + p + " | Valor Asociado: " + valor);
        }
    }

    public Map<Person, String> contruirTreeMapPersonsObj() {
  
    Map<Person, String> treePersonObj = new java.util.TreeMap<>();
    List<Person> list=new ArrayList<>();
    list.add(new Person(12345, 30, "Ana"));
    list.add(new Person(123467, 30, "luis"));
    list.add(new Person(123478, 30, "jose"));
    list.add(new Person(123489, 30, "diego")); 
    list.add(new Person(1234910, 30, "andres"));
    return treePersonObj;
}
}
}
