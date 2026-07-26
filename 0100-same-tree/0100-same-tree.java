/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        Queue<TreeNode> qu=new LinkedList<>();
        qu.add(p);
        qu.add(q);
        while(!qu.isEmpty()){
            p=qu.poll();
            q=qu.poll();
            if(p==null&&q==null){
                continue;
            }
            else if(p==null||q==null||p.val!=q.val){
                return false;
            }
            qu.add(p.left);
             qu.add(q.left);
              qu.add(p.right);
               qu.add(q.right);
            
        }
        return true;
        
    }
}