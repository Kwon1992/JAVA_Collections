package com.company.kwonhyunwoo;

import java.util.PriorityQueue;
import java.util.Queue;

public class F_Queue_Priority {
    /**
     * 	 Based on a priority heap !!!!!!
     *
     * 		We assign a ""Priority Value"" to EVERY single item.
     *
     * 			- element with high priority is served before an element with low priority
     * 			(우선순위가 높은 element가 낮은 element보다 먼저 나옴)
     *
     * 			~ the elements of the priority queue are ordered according to their natural ordering
     * 					[[ defined by the Comparable interface ]] - 중요!!!
     *
     * add() -> add elements to the queue
     *
     * peek() -> Retrieves, but does not remove, the head of this queue,
     * 				or returns null if this queue is empty.
     *
     * poll() -> Retrieves and removes the head of this queue, or returns null if this queue is empty
     *
     */

    public static void main(String[] args) {
//        Queue<Person> queue = new PriorityQueue<>();
//
//        queue.add(new Person("Adam", 22));
//        queue.add(new Person("Harris", 37));
//        queue.add(new Person("Kevin", 12));
//        queue.add(new Person("Frank", 46));
//
//        while (queue.peek() != null) {
//            System.out.println(queue.poll());
//        }

        Queue<Comparable_Person> queue = new PriorityQueue<>();
        queue.add(new Comparable_Person("Adam", 22));
        queue.add(new Comparable_Person("Harris", 37));
        queue.add(new Comparable_Person("Kevin", 12));
        queue.add(new Comparable_Person("Frank", 46));

        while (queue.peek() != null) {
            System.out.println(queue.poll());
        }
        // 나이가 적은 순으로 출력됨.
    }
}

class Person { // com.company.kwonhyunwoo.Person cannot be cast to ""java.lang.Comparable"" - Person 클래스를 비교할 수 없어서 compiel error가 발생한다.
    private String name;
    private int age;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: " + name + " - " + age;
    }
}


class Comparable_Person implements Comparable<Comparable_Person>{
    private String name;
    private int age;

    public Comparable_Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: " + name + " - " + age;
    }

    /**
     * s1.compareTo(s2) return value
     * s1 == s2 : 0
     * s1 > s2  : positive
     * s1 < s2  : negative
     */
    @Override
    public int compareTo(Comparable_Person o) {
        return Integer.compare(this.age, o.age);
        // return this.name.compareTo(o.getName()); // 이름순으로 정렬
    }


}