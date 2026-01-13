import java.util.Set;

import Structures.Sets.Sets;
import models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        Sets setsClases = new Sets();
        Set<String> hashSet = setsClases.construirHashSet();
        System.out.println(hashSet);
        System.out.println(hashSet.size());
        System.out.println(hashSet.contains("A"));
        System.out.println("A".hashCode());
        //System.out.println(Integer.hashCode(10));
        String a1 = "A";
        String a2 = "A";
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a1.equals(a2));
        System.out.println(a1 == a2);

        Node<String> n1 = new Node<>("A");
        Node<String> n2 = new Node<>("A");
        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());
        System.out.println(n1.hashCode() == n2.hashCode());

        Set<String> linkedHashSet = setsClases.contruirLinkedHashSet();
        System.out.println(linkedHashSet);

        Set<String> treeSet = setsClases.construirTreeSet();
        System.out.println(treeSet);

    }
}
