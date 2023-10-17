/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
        
        unordered_set<ListNode*>ll;
        
        ListNode *temp=head;
        
        while(temp!=nullptr){
            if(ll.find(temp)!=ll.end()){
                return true;
            }
            ll.insert(temp);
            temp=temp->next;
        }
        return false;
        
    }
};