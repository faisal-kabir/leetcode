import java.util.*;


public class Find_Mode_in_Binary_Search_Tree_501 {
    static List<Integer> data = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println(findMode(TreeNode.createTree(new Integer[]{32,26,47,19,27,null,56})));
    }

    public static int[] findMode(TreeNode root) {
        makeList(root);
        Collections.sort(data);
        Collections.reverse(data);
        List<Integer> list = new ArrayList<>();
        list.add(data.get(0));
        System.out.println(data);

        for(int i = 1; i<data.size(); i+=2){
            if(data.size()-1 >= i+1){
                list.add(data.get(i+1));
            }
            list.add(data.get(i));
        }
        System.out.println(list);
        
        return list.stream()
        .mapToInt(Integer::intValue)
        .toArray();
    }
    public static void makeList(TreeNode node){
        if(node==null){
            return;
        }
        data.add(node.val);

        if (node.left != null){
            makeList(node.left);
        }

        if (node.right != null){
            makeList(node.right);
        }
    }
}
