package com.campusdual.classroom;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise {

    public static Set<String> createHashSet() {
        Set<String> elementsHashSet = new HashSet<>();

        elementsHashSet.add("ELEMENT KPRBC");
        elementsHashSet.add("ELEMENT YPBTM");
        elementsHashSet.add("ELEMENT AADXU");
        elementsHashSet.add("ELEMENT RXCGJ");
        elementsHashSet.add("ELEMENT WYMVD");
        elementsHashSet.add("ELEMENT WFGEJ");
        elementsHashSet.add("ELEMENT TYGBS");
        elementsHashSet.add("ELEMENT MAPTK");
        elementsHashSet.add("ELEMENT GJXVE");
        elementsHashSet.add("ELEMENT BAFGL");

        return elementsHashSet;

    }

    public static Set<String> createTreeSet() {
        Set<String> elementsTreeSet = new TreeSet<>();

        elementsTreeSet.add("ELEMENT KPRBC");
        elementsTreeSet.add("ELEMENT YPBTM");
        elementsTreeSet.add("ELEMENT AADXU");
        elementsTreeSet.add("ELEMENT RXCGJ");
        elementsTreeSet.add("ELEMENT WYMVD");
        elementsTreeSet.add("ELEMENT WFGEJ");
        elementsTreeSet.add("ELEMENT TYGBS");
        elementsTreeSet.add("ELEMENT MAPTK");
        elementsTreeSet.add("ELEMENT GJXVE");
        elementsTreeSet.add("ELEMENT BAFGL");

        return elementsTreeSet;

    }

    private static void printSet(Set<String> customSet) {
        for (String s : customSet) {
            System.out.println(s);

        }
    }

    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        return set.add(elementToAdd);

    }

    public static void main(String[] args) {
        Set<String> hashSet = createHashSet();
        Set<String> treeSet = createTreeSet();

        System.out.println("=== HashSet ===");
        printSet(hashSet);
        System.out.println("====================");

        System.out.println("=== TreeSet ===");
        printSet(treeSet);
        System.out.println("====================");



        boolean addedHash = addElementToSet(hashSet, "ELEMENT AAA");
        boolean addedTree = addElementToSet(treeSet, "ELEMENT AAA");

        System.out.println("Elemento añadido a HashSet: " + addedHash);
        System.out.println("Elemento añadido a TreeSet: " + addedTree);

        System.out.println("====================");
        System.out.println("=== HashSet actualizado ===");
        printSet(hashSet);
        System.out.println("====================");
        System.out.println("=== TreeSet actualizado ===");
        printSet(treeSet);

    }
}


