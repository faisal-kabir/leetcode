import java.util.*;

public class N_ary_Tree_Preorder_Traversal_589 {
    List<Integer> nodes = new ArrayList<Integer>();

    public void main(String args[]) {
        // Node root = makeNode(new Integer[]{1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14});
        // System.out.println(root);
    }

    // private static Node makeNode(Integer[] is) {
    //     Node head = new Node(is[0]);

    //     for(int i=1; i<is.length; i++){
    //         if(is[i] == null){
    //             List<Node> children = makeChuldren(is,i+1);
    //             head.children = children;
    //         }
    //     }

    //     return head;
    // }

    // private static List<Node> makeChuldren(Integer[] is, int index) {
    //     List<Node> children = new ArrayList<Node>();
    //     for(int i=index; i<is.length; i++){
    //         if(is[i] == null) {
    //             break;
    //         }
    //         children.add(new Node(is[i]));
    //     }
    //     return children;
    // }
    public List<Integer> preorder(Node root) {
        if(root==null) return null;
        
        System.out.println(root.val);
        nodes.add(root.val);
        root.children.forEach((Node value)->{
            System.out.println(value.val);
            if(value.val==0L)
                nodes.add(value.val);
            printAllData(value.children,0);
        });
        return nodes;
    }

    private void printAllData(List<Node> children, int lavel) {
        children.forEach((Node value2)->{
            System.out.println(value2.val);
            if(value2.val==0L)
                nodes.add(value2.val);
            if(value2==null || !value2.children.isEmpty()){
                printAllData(value2.children,lavel+1);
            }
        });
    }


}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
