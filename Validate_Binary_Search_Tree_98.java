public class Validate_Binary_Search_Tree_98 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
        }
    }

    public static void main(String args[]) {
        
    }
    static boolean valid = true;
    public static boolean isValidBST(TreeNode root) {
        if(root == null){
            return false;
        } else if (root.left == null && root.right == null){
            return true;
        }

        nextNode(root);
        return valid;
    }

    public static void nextNode(TreeNode node){
        if((node.left!=null && node.left.val >= node.val) || (node.right!=null && node.val >= node.right.val)){
            valid = false;
        }

        if (node.left != null){
            nextNode(node.left);
        }

        if (node.right != null){
            nextNode(node.right);
        }
    }

}
