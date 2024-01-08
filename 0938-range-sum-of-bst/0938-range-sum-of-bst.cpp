/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int rangeSumBST(TreeNode* root, int low, int high) {
        int sum=0;
        while(root){
            if(root->left){
                TreeNode* temp=root->left;
                TreeNode* curr=root->left;
                while(temp->right){
                    temp=temp->right;
                }
                temp->right=root;
                root->left=NULL;
                root=curr;
            }
            else{
                if(root->val>=low&&root->val<=high){
                    sum+=root->val;
                }
                root=root->right;
            }
        }
        return sum;
    }
};