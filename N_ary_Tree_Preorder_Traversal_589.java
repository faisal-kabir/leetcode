import java.util.*;

public class N_ary_Tree_Preorder_Traversal_589 {
    List<Integer> nodes = new ArrayList<Integer>();

    public List<Integer> preorder(Node root) {
        if(root == null) return new ArrayList<Integer>();
    
        nodes.add(root.val);
        root.children.forEach((Node value)->{
            if(value!=null)
                nodes.add(value.val);
            printAllData(value.children,0);
        });
        return nodes;
    }

    private void printAllData(List<Node> children, int lavel) {
        children.forEach((Node value2)->{
            if(value2!=null)
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
