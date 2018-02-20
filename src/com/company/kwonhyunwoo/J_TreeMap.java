package com.company.kwonhyunwoo;

import java.util.Map;
import java.util.TreeMap;

public class J_TreeMap {
    /**
     * 	TreeMap -> implementation of the Map interface !!!
     *
     * 		~ the concrete implementation is a red-black tree (Balanced Tree)
     *
     * 		- the map is sorted according to the natural ordering of its keys
     * 			or we can use the Comparable for custom objects (Sorted!!)
     *
     * 		- O(logN) guaranteed running times because of the balanced tree implementation
     * 					get()  ,  put()   ,  remove()
     *
     * 			AGAIN this data structure is NOT synchronized !!!
     */

    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Adam", 13);
        map.put("Joe", 14);
        map.put("Ana", 35);
        map.put("Andrew", 33);
        map.put("Kevin", 25);

        for (String s : map.keySet()) {
            System.out.println(s + "-" + map.get(s));
        }
        //입력 순서와 관계 없이 이름순으로 정렬되어서 출력됨. (Sorted)
    }
}
