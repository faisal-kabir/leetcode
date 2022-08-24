public class Validate_Binary_Search_Tree_98 {

    public static void main(String args[]) {
        System.out.println("Is valid = "+isBST(TreeNode.createTree(new Integer[]{32,26,47,19,null,null,56,null,27}),null,null));
    }
    static boolean isBST(TreeNode node,Integer low, Integer high) {
        if (node == null)
            return true;
        
        if (low != null && node.val <= low)
            return false;
        
        if (high!=null && node.val >= high)
            return false;
        
        if (!isBST(node.right,node.val,high))
            return false;

        if (!isBST(node.left,low,node.val))
            return false;
        
        return true;
    }

}
