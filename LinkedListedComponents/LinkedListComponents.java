package LinkedListedComponents;

import java.util.HashSet;
import java.util.Set;

class LinkedListComponents {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public int numComponents(ListNode head, int[] nums) {
        int ans = 0;
        Set<Integer> setG = new HashSet<>();

        for (final int g : nums)
            setG.add(g);

        for (; head != null; head = head.next)
            if (setG.contains(head.val) && (head.next == null || !setG.contains(head.next.val)))
                ++ans;

        return ans;

    }
}