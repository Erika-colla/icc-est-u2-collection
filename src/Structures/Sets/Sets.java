package Structures.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import Structures.models.Person;

public class Sets {

    public Sets() {
    }

    public Set<String> construirHashSet() {

        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("AD");
        return hashSet;
    }

    public Set<String> contruirLinkedHashSet() {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("A");
        linkedHashSet.add("D");
        linkedHashSet.add("1a");
        linkedHashSet.add("2n");
        linkedHashSet.add("3g");
        linkedHashSet.add("y5g");
        linkedHashSet.add("6fr");
        linkedHashSet.add("7fe");
        linkedHashSet.add("5sd");
        linkedHashSet.add("9hsb");
        linkedHashSet.add("D0dbd");
        
        return linkedHashSet;

    }

    public Set<String> construirTreeSet() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("D");
        treeSet.add("A");
        treeSet.add("E");
        treeSet.add("I");
        treeSet.add("B");
        treeSet.add("O");
        treeSet.add("a");
       
        return treeSet;
    }

    public Set<String> construirTreeSetConComparador() {
        Set<String> treeSet = new TreeSet<>((pal1, pal2)->{
            return pal1.compareToIgnoreCase(pal2);
        });
        treeSet.add("D");
        treeSet.add("A");
        treeSet.add("E");
        treeSet.add("I");
        treeSet.add("B");
        treeSet.add("O");
        treeSet.add("a");

        return treeSet;
    }

    public Set<Person> personsTreeSet() {
        // Set<Person> treePersons = new TreeSet<>((p1, p2)->{
        //     //solo edad
        //     //int com = Integer.compare(p1.getAge(), p2.getAge());
        //     //return com;
        //     //solo nombre
        //     //return p2.getName().compareTo(p1.getName());

        //     int conN = p2.getName().compareTo(p1.getName());
        //     if (conN != 0) 
        //         return conN;
        //     int comE = Integer.compare(p2.getAge(), p1.getAge());
        //     return comE;
        // });

        Set<Person> treePersons = new TreeSet<>();

        treePersons.add(new Person("Carlos", 23));
        treePersons.add(new Person("Ana", 30));
        treePersons.add(new Person("Luis", 18));
        treePersons.add(new Person("Ana", 20));
        treePersons.add(new Person("Andres", 23));
        treePersons.add(new Person("Luis", 18));

        return treePersons;
    }

}
