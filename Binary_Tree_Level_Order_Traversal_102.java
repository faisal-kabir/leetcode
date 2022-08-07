import java.util.*;

public class Binary_Tree_Level_Order_Traversal_102 {
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
    static List<List<Integer>> lavelList = new ArrayList<List<Integer>>();

    public static void main(String args[]) {
        
    }


    public static List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<List<Integer>>();
        }

        getNodes(root,0);

        return lavelList;
    }

    public static void getNodes(TreeNode node,int lavel){
        List<Integer> nodes;
        if(lavelList.size() > lavel){
            nodes = lavelList.get(lavel);
            nodes.add(node.val);
            lavelList.set(lavel,nodes);
        } else {
            nodes = new ArrayList<Integer>(Arrays.asList(node.val) );
            lavelList.add(nodes);
        }

        if (node.left != null){
            getNodes(node.left,lavel+1);
        }

        if (node.right != null){
            getNodes(node.right,lavel+1);
        }
    }

}
