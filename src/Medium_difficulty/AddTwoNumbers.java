package Medium_difficulty;

import Leetcode_classes.ListNode;

import java.math.BigInteger;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String first = "";
        String second = "";

        while (l1 != null) {
            first += Integer.toString(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            second += Integer.toString(l2.val);
            l2 = l2.next;
        }

        first = new StringBuilder(first).reverse().toString();
        second = new StringBuilder(second).reverse().toString();


        BigInteger math = new BigInteger(first).add(new BigInteger(second));
        String solution = math.toString();
        solution = new StringBuilder(solution).reverse().toString();

        ListNode head = new ListNode(Character.getNumericValue(solution.charAt(0)));
        ListNode current = head;


        for (int i = 1; i < solution.length(); i++) {
            current.next = new ListNode(Character.getNumericValue(solution.charAt(i)));
            current = current.next;
        }

        return head;
    }
}
