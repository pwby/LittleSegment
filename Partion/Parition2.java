package day20;

/**
 * author:byw
 * 制造假结点
 */
public class Parition2 {
    public ListNode Partition2(ListNode head, int x) {
        ListNode less_head = new ListNode(0);
        ListNode more_head = new ListNode(0);

        ListNode less_cur = less_head;
        ListNode more_cur = more_head;

        while (head != null) {
            if (head.val < x) {
                less_cur.next = head;
                less_cur = less_cur.next;
            } else {
                more_cur.next = head;
                more_cur = more_cur.next;
            }
            head = head.next;
        }
        more_cur.next = null;
        less_cur.next = more_head.next;
        return less_head.next;
    }
}
