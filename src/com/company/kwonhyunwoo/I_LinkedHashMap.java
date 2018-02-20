package com.company.kwonhyunwoo;

import java.util.LinkedHashMap;
import java.util.Map;

public class I_LinkedHashMap {
    /**
     * 	It has the same features as we have seen for HashMap
     *
     * 		BUT for HashMap -> "" no guarantees about the iteration order. ""
     * 				It can even change completely when new elements are added
     *
     * 				~ there is a doubly-linked list between all of its entries: so the order will be the order
     * 					in which we have inserted the items "INSERTION ORDER" // 들어간 순서대로 출력된다..
     *
     * 				~ LinkedHashMap is NOT synchronized as well !!!
     *
     * 		LinkedHashMap -> we can iterate in the order in which the entries were put into the map
     */

    public static void main(String[] args) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("A", 1);
        linkedHashMap.put("B", 2);
        linkedHashMap.put("C", 3);
        linkedHashMap.put("D", 4);
        linkedHashMap.put("E", 5);
        linkedHashMap.put("F", 6);
        linkedHashMap.put("G", 7);
        linkedHashMap.put("H", 8);
        linkedHashMap.put("I", 9);
        linkedHashMap.put("K", 11);
        linkedHashMap.put("J", 10);

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        System.out.println("****************");

        for (String s : linkedHashMap.keySet()) {
            System.out.println(s + "-" + linkedHashMap.get(s));
        }


    }
}
