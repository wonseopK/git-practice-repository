package prac;

import java.util.LinkedList;

//prec
public class LinkedListPrac {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("one");
        linkedList.add("two");
        linkedList.add(1, "three");
        System.out.println(linkedList);
    }
}
