package com.company.kwonhyunwoo;

import java.util.ArrayDeque;
import java.util.Deque;

public class G_Deque {
    /**
     * 	Deque --> ArrayDeque is the implementation (거의 사용되지 않음...)
     *
     * 		deque: "doubly-ended queue"
     *
     * 			We can insert and remove from BOTH SIDES of the queue
     *
     * 				offerFirst(T t) and offerLast(T t)  // 처음과 끝에 item 추가
     * 				removeFirst() and removeLast()      // 처음과 끝에서 item return.
     *
     * 				+ it is NOT thread safe
     * 				+ it allows unlimited insertion of items
     * 				+ ArrayDeque can be used as queue and stack both
     * 						When it is used as stack, it is faster than stack and
     * 								when it is used as queue, it is faster than linkedList !!!
     *
     */

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerFirst(10);
        deque.offerLast(20);
        deque.offerFirst(30);
        deque.offerLast(40);

        /**
         *                  FIRST
         *  ---------------------
         *  | 40 | 20 | 10 | 30 | -->
         *  ---------------------
         *   LAST
         */

        for (Integer integer : deque) {
            System.out.println(integer); // 30, 10, 20, 40 순으로 print됨.
        }


    }
}
