package merge;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode answer = null;

        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else if (list1 == null && list2 == null) {
            return answer;
        }

        if (list1.val <= list2.val) {
            answer = list1;
            answer.next = mergeTwoLists(list1.next, list2);
        } else {
            answer = list2;
            answer.next = mergeTwoLists(list1, list2.next);
        }


        return answer;
    }
}


