package leet75;

import Leetcode_classes.ListNode;

import java.util.ArrayList;

public class Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {

        ArrayList<Integer> list = new ArrayList<>();
        ListNode start = head;
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        head = start;
        for (int i = list.size() - 1; i >= 0; i--) {
            head.val = list.get(i);
            head = head.next;
        }

        head = start;

        return head;
    }
}

/*
*
    Runtime
    1
    ms
    Beats
    3.70%
            Memory
            43.49
            MB
            Beats
            99.40%
*
*
*
* */
