
//-----------------------------------------------------------------------------------//
//Example:
//    10
//   /  \
//  20  30
//  / \  
// 40 50 
//-----------------------------------------------------------------------------------//

class Node{
    int key;
    Node left, right;

    public Node(int item){
        key = item;
        left = right = null;
    }
}

public class ques9_II{

    Node root;

    void preorderTraversal(Node node){
        if(node == null){
            return;
        }

        System.out.print(node.key + " ");

        preorderTraversal(node.left);

        preorderTraversal(node.right);

    }
    public static void main(String[] args) {

        ques9_II tree = new ques9_II();

        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);

        tree.preorderTraversal(tree.root);
 
    }
}