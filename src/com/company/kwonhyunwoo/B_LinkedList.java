package com.company.kwonhyunwoo;

import java.util.LinkedList;
import java.util.List;

public class B_LinkedList {
    /**
     * It is another implementation of the List interface
     * 		~ implements List, Queue, Deque interfaces + ...
     *
     * 	It uses references -> each item has a reference to the next item + store the
     * 			data itself
     *
     * 			34  ->  100  ->  -12  ->  1  single linked list
     * 			34  <-> 100  <-> -12 <->  1  doubly-linked list
     *
     * 		- NO RANDOM ACCESS !!!
     * 		- not synchronized << 여러 Thread가 같은 LinkedList에 한 번에 접근하는 경우 적절한 조치가 필요하다. >>
     * 		- we can remove items very efficiently / 시작 혹은 끝을 지울 때에는 O(1) 의 시간이 걸린다.
     * 		- Sequential access !!! if we want to find an item we have to iterate through
     * 			the list until we find it / O(N)
     * 		- remove operation is very efficient: just update the references/pointers O(1)
     *
     * 		- so we should use a linkedList for "" REMOVE - HEAVY applications !!! ""
     */
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }
        System.out.println("**************************");

        list.remove(5);
        list.remove(2);
        list.remove(6);

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
