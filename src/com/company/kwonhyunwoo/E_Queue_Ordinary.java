package com.company.kwonhyunwoo;

import java.util.LinkedList;
import java.util.Queue;

public class E_Queue_Ordinary {
    /**
     *	We insert the items at the end of the queue and items are removed from
     *		the beginning of the queue
     *
     *			FIFO structure -> First In First Out !!!
     *
     *			we insert items here + get items here   <-->	| STACK |
     *			we insert items here   ->	| QUEUE |  ->  we get the items here
     *
     *
     *
     *		java.util.LinkedList
     *		java.util.PriorityQueue -> PriorityQueue stores its elements internally according to their natural order (if they implement Comparable)
     *
     *		add() -> we add items to our queue
     *
     *		element() -> approximately the same as peek(): we get the first item without removing it !!!
     *
     *		remove() -> this method removes the element at the head of the queue and return.
     *
     *		Applications: breadth-first search !!! (BFS)
     */

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Adam");
        queue.add("Brian");
        queue.add("Carol");

        for (String s : queue) {
            System.out.println(s);
        }

        System.out.println("*********************************");
        System.out.println(queue.element()); // stack의 peek과 비슷.
        System.out.println(queue.size());
        System.out.println(queue.remove()); // remove -> head의 element를 반환하면서 삭제 (stack의 pop과 비슷)
        System.out.println(queue.size());
        System.out.println("*********************************");

        for (String s : queue) {
            System.out.println(s);
        }
    }
}
