package com.company.kwonhyunwoo;

import java.util.List;
import java.util.Stack;

public class D_Stack {
    /** << Stack extends Vector in JAVA >> (( class Stack<E> extends Vector<E> ))
     * 	A Stack is a data structure where you add elements to the "top" of the stack,
     * 		 and also remove elements from the top again
     *
     * 			Last In First Out (LIFO) principle
     *
     * 				- Stack's are really good for some types of data processing
     * 					For instance if you are parsing an XML file using either SAX or StAX
     *
     * 		push() method pushes an object onto the top of the Stack
     *
     * 		peek() method returns the object at the top of the Stack, but does not
     * 					remove object
     *
     * 		pop() method returns the object at the top of the stack,
     * 				 and removes the object from the Stack
     *
     * 		Applications --> for example graph traversing with depth-first search !!!
     *
     */

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(100);
        stack.push(1000);
        stack.push(10000);

        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        // First In Last Out!

        for (Integer integer : stack) {
            System.out.println(integer); // Iterable을 implements 했으므로 for-each문 가능
        }
    }
}
