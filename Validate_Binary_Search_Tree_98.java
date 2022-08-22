public class Validate_Binary_Search_Tree_98 {

    public static void main(String args[]) {
        isValidBST(TreeNode.createTree(new Integer[]{32,26,47,19,null,null,56,null,27}));
    }
    static boolean valid = true;
    public static boolean isValidBST(TreeNode root) {
        if(root == null){
            return false;
        } else if (root.left == null && root.right == null){
            return true;
        }

        nextNode(root,root.val,0,null,null);
        return valid;
    }

    public static void nextNode(TreeNode node,int headValue,int lastValue,Boolean isLeft,Boolean isHeadLeft){
        System.out.println(node.val + " isLeft = "+isLeft+" / isHeadLeft = "+isHeadLeft+" / Last Value = "+lastValue);
        if(isHeadLeft!=null){
            if(isHeadLeft && headValue<node.val){
                valid = false;
            } else if(!isHeadLeft && headValue>node.val){
                valid = false;
            } else if(isLeft && node.val > lastValue){
                valid = false;
            } else if(!isLeft && node.val < lastValue){
                valid = false;
            }
        }

        if(valid){
            if (node.left != null){
                nextNode(node.left,headValue,node.val,true,isHeadLeft!=null ? isHeadLeft : true);
            }

            if (node.right != null){
                nextNode(node.right,headValue,node.val,false,isHeadLeft!=null ? isHeadLeft : false);
            }
        }
    }

}
