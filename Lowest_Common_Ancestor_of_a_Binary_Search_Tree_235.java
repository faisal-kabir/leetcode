public class Lowest_Common_Ancestor_of_a_Binary_Search_Tree_235 {
    public static void main(String[] args) {
        System.out.println(lowestCommonAncestor(TreeNode.createTree(new Integer[]{2,1}), new TreeNode(2), new TreeNode(1)).val);
        System.out.println(lowestCommonAncestor(TreeNode.createTree(new Integer[]{10,-10,30,null,8,25,60,6,9,null,28,null,78}), new TreeNode(6), new TreeNode(30)).val);
        System.out.println(lowestCommonAncestor(TreeNode.createTree(new Integer[]{10,-10,30,null,8,25,60,6,9,null,28,null,78}), new TreeNode(28), new TreeNode(78)).val);
        System.out.println(lowestCommonAncestor(TreeNode.createTree(new Integer[]{10,-10,30,null,8,25,60,6,9,null,28,null,78}), new TreeNode(30), new TreeNode(78)).val);
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return root;
        }

        while (root != null){
            if(root.val < p.val && root.val < q.val){
                root = root.right;
            } else if(root.val > p.val && root.val > q.val){
                root = root.left;
            } else {
                break;
            }
        }
        return root;
    }
}
