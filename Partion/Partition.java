package day20;

/**
 * author:byw
 */
import java.util.*;


public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if (pHead == null) {
            return null;
        }
        ListNode smallList = null;
        ListNode smallLast = null;
        ListNode bigList = null;
        ListNode bigLast = null;
        ListNode temp = pHead;
        while (temp != null) {
            ListNode next = temp.next;
            if (temp.val < x) {
                if (smallList == null) {
                    smallList = temp;

                } else {
                    smallLast.next = temp;

                }
                smallLast = temp;
            } else {
                if (bigList == null) {
                    bigList = temp;

                } else {
                    bigLast.next = temp;

                }
                bigLast = temp;
            }
            temp = next;
        }

        if (smallList == null) {
            bigLast.next = null;
            return bigList;
        }
        smallLast.next = bigList;
        if (bigLast != null) {
            bigLast.next = null;
        }


        return smallList;

    }
}