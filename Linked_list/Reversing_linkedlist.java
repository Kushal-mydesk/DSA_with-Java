package Linked_list;

import java.util.*;

public class Reversing_linkedlist {

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> ll) {
        for (int i = 0; i < ll.size() / 2; i++) {
            int temp = ll.get(i);
            ll.set(i, ll.get(ll.size() - i - 1));
            ll.set(ll.size() - i - 1, temp);
        }
        // Return the reversed linkedlist
        return ll;
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        int count = 5;

        for (int i = 1; i <= 5; i++) {
            ll.add(count);
            count--;
        }
        System.out.println(ll);
        reverseLinkedList(ll);
        System.out.println(ll);

    }
}
