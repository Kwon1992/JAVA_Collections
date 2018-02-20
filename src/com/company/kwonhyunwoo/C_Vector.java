package com.company.kwonhyunwoo;

import java.util.List;
import java.util.Vector;

public class C_Vector {
    /**
     * It is similar to ArrayList with two differences
     *
     * 		- Vectors are ""synchronized"" : multiple threads can manipulate the content of a vector without any inconsistency
     * 	    << Synchronized 되어있으므로 멀티 쓰레딩 작업에 적합하다. >>
     *
     * 		- Vectors contain many legacy methods(not part of the Collection Framework)
     * 					~ so lists(ArrayList, LinkedList) do not have these methods !!!
     *
     * 		new Vector(capacity, capacityIncrement)
     * 			 The vector's storage increases in chunks the size of capacityIncrement. An application can increase
     * 				 the capacity of a vector before inserting a large number of components
     * 					~ this reduces the amount of incremental reallocation.
     *
     *
     * 		    /**
     * Constructs an empty vector with the specified initial capacity and
     * capacity increment.
     *
     * @param   initialCapacity     the initial capacity of the vector
     * @param   capacityIncrement   the amount by which the capacity is increased when the vector overflows. (( Vector가 가득찼을 때 얼마씩 vector의 크기를 늘릴 것인지 지정 ))
     *
     * @throws IllegalArgumentException if the specified initial capacity is negative
     *
     *
     *       public Vector(int initialCapacity, int capacityIncrement) {
     *           super();
     *           if (initialCapacity < 0)
     *               throw new IllegalArgumentException("Illegal Capacity: "+
     *                       initialCapacity);
     *           this.elementData = new Object[initialCapacity];
     *           this.capacityIncrement = capacityIncrement;
     *       }
     *
     * 			SO: every time the vector becomes full --> the size will be incremented by the capacityIncrement !!!
     *
     */

    public static void main(String[] args) {
        List<Integer> vector = new Vector<>(10,5);

        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        vector.remove(0);

        for (Integer integer : vector) {
            System.out.println(integer);
        }
    }
}
