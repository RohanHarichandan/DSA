/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode temp=head;
        int size=0;
        
        while(temp!=null){
            size++;
            temp=temp.next;  
        }
        
        int l=size-k+1;
        int kVal=0;
        int lVal=0;
        
        if(k==l){
            return head;
        }
        temp=head;
        for(int i=1;i<=size;i++){
            if(i==k){
                kVal=temp.val;
            }
            if(i==l){
                lVal=temp.val;
            }
            temp=temp.next;
        }
        temp=head;
        
        for(int i=1;i<=size;i++){
            if(i==k){
                temp.val=lVal;
            }
            if(i==l){
                temp.val=kVal;
            }
            temp=temp.next;
        }
        return head;
        
    }
}