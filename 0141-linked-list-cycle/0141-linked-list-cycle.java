/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        HashSet<ListNode>ll=new HashSet<>();
        ListNode temp=head;
        
        while(temp!=null){
            if(ll.contains(temp)){
                return true;
            }
            ll.add(temp);
            temp=temp.next;
        }
        return false;
    }
}