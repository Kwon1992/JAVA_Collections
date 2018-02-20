package com.company.kwonhyunwoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A_ArrayList {
    /**
     * 	This is one of the implementations of the List interface !!!
     * 		배열이 값을 저장함.
     * 		int[] array = new int[10];
     *
     * 	- random access / very fast O(1)  --> random access: accessing items by the index ~list.get(0)
     * 	[[탐색속도가 매우 빠름. _ O(1)]] 배열을 이용하기 때문에 첫번째 element를 접근할 때 index로 0을 사용한다.
     *
     * 	- it is equivalent to Vector BUT ""arrayList is not synchronized""
     *
     * 	- all other operations run in O(N) time approximately
     *
     *  - but if we want to remove items, this operation is not so efficient
     *  		We have to shift each item in our list - O(N)
     *  	<<< ArrayList에서 remove가 자주 일어나는 경우 계속해서 Shift가 일어나기 때문에 O(N)의 시간이 걸림... LinkedList가 더 효율적이다!! >>>
     *
     *  If our application is just about adding elements to a list and
     *  	getting elements with known indexes -> an arrayList is perfect
     *  	<<< 계속해서 element들을 추가 혹은 탐색을 하는 경우에 ArrayList가 최적이다. >>>
     *
     * 	capacity: it is a parameter we can define when we instantiate an ArrayList
     * 		It is the initial size of the array
     * 			~ if we know that we will store 5 million items in a list we should use it
     * 					list = new ArrayList(5000000) WHY? """ This may reduce the amount of incremental reallocation. """
     * 		<<< 몇 개의 element가 들어갈 지 알 경우에는 Constructor에 크기를 지정해서 주면 처음부터 해당 크기만큼 할당 >>>
     *
     */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(5); // ArrayList는 List Interface를 구현한 것이므로 다음과 같이 할당 가능.
        list.add("Adam");
        list.add("Brian");
        list.add("Carol");
        list.add("Dennis");
        list.add("Ebony");

        System.out.println(list.get(1)); // index 1에 해당하는 값을 get하는 경우 Brian이 나옴.
        System.out.println(list.isEmpty());

        System.out.println("*************************************");

        System.out.println(Arrays.toString(list.toArray()));

        System.out.println("*************************************");

        for (String s : list) {
            System.out.println(s);
        }

    }
}
