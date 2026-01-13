package Structures.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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

    public void construirTreeSetConComparador() {

    }

}
