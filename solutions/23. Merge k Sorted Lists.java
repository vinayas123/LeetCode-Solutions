/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a,b)->a.val-b.val);
        
        for(ListNode node : lists){
            if(node != null)
                queue.offer(node);
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode home = null;
        
        ListNode current = dummy;
        while(!queue.isEmpty()){
            
            current.next = queue.poll();
            current = current.next;
            if(current.next != null)
                queue.offer(current.next);
            
        }
        return dummy.next;
    }
}
