package com.company.kwonhyunwoo;

import java.util.HashMap;
import java.util.Map;

public class H_HashMap {
    /**
     * Map - <Key, Value>
     *
     * An object that maps keys to values. A map ""cannot contain duplicate keys"",
     * 		 each key can map to at most one value
     *
     * Some map implementations, like the TreeMap class, make specific guarantees as
     * 	 to their order
     * 			~ others, like the HashMap class --> do not !!!
     *
     *  << Map 구현의 차이 >>
     * 		TreeMap: it is sorted
     * 		Hashtable: it is synchronized + it is slow !!!
     * 		HashMap: is not synchronized
     * 			Hashtable does not allow null keys or values.  HashMap allows one null key and
     * 				 any number of null values
     *
     * Hashfunction -> ~ O(1)
     *
     * hashfunction 이용해서 Key -> Value Pair connection 만듦.
     * 하지만, collision이 일어날 수 있다.
     *
     */

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Adam", 23);
        map.put("Frank", 33);
        map.put("Kevin", 43);

        System.out.println(map.get("Adam"));
        System.out.println(map.get("Easter"));

        System.out.println("*********************");

        for (String s : map.keySet()) {
            System.out.println(map.get(s));
        }
    }
}
