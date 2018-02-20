package com.company.kwonhyunwoo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class L_LinkedHashSet {
    /**
     * 	Set is a collection that contains ""NO DUPLICATE"" elements
     * 		~ so there is no pair of elements e1 and e2 such that
     * 			e1.equals(e2)
     *
     * 		1.) HashSet
     *  				It contains a HashMap in the background
     *
     * 			  - it makes no guarantees as to the iteration order of the set
     * 					It does not guarantee that the order will remain constant over time (( iteration 순서에 대해 보장되지 않는다. 변할 수 있음 ))
     *
     *			  - HashSet allows null element
     *
     *			  - if the hash function is "perfect" --> the operations have O(1)
     *					constant running time
     *						add(), remove(), contains(), size()
     *			  - NOT synchronized
     *
     *			Iteration performance: iterating over a HashSet requires time proportional to the size of the set + capacity
     *					So: number of items + number of buckets  [[NOT TO SET THE INITIAL CAPACITY TOO HIGH !!!]]
     *
     *
     *		2.) LinkedHashSet: extends HashSet class (따라서 HashSet과 같이 hashMap을 포함함) + implements Set interface
     *
     *				It has ""predictable"" iteration order UNLIKE HashSet.
     *					It maintains a doubly-linked list between all of its items
     *						~ thats why the iteration order is well defined
     *								"insertion order"
     *
     *				!! We use LinkedHashSet when we copy a set !!
     *				Not synchronized
     *
     *				O(1)   --> add() ; remove() ; contains() (if hash function is "perfect")
     *					It is a bit slower than HashSet because of the additional cost
     *						of maintaining a linked list
     *
     *				THE ITERATION RUNNING TIME IS UNAFFECTED BY THE CAPACITY
     *					Iteration performance -> number of items that counts !!!
     *
     * 		3.) TreeSet: red-black tree implementation (Balanced, Sorted) // Comparable 구현한 class에 대해서 사용 가능!
     * 				O(logN) running times for most of the operations
     * 					It is a sorted data structure !!!
     *
     * 				TreeSet is practically implemented using TreeMap instance
     *
     */

    public static void main(String[] args) {
        //HashSet
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Car");
        set.add("Door");
        set.add("Door");
        set.add("Door");


        System.out.println(set.contains("Apple"));
        System.out.println(set.contains("Elephant"));

        System.out.println("**************************");

        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("**************************");
        // LinkedHashSet
        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Apple");
        linkedSet.add("Banana");
        linkedSet.add("Car");
        linkedSet.add("Door");
        linkedSet.add("Door");
        linkedSet.add("Door");

        for (String s : linkedSet) { // Insertion Order.
            System.out.println(s);
        }
        System.out.println("**************************");
        // TreeSet
        Set<Integer> treeset = new TreeSet<>();

        treeset.add(2);
        treeset.add(10);
        treeset.add(7);
        treeset.add(-2);
        treeset.add(0);
        treeset.add(2);

        for (Integer integer : treeset) {
            System.out.println(integer);
        }
    }
}
