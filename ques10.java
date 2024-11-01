// Write a Java program to get the in-order traversal of its nodes' values in a binary tree.
//-----------------------------------------------------------------------------------//
//     10
//    / \
//   20   30
//  / \
// 40   50
// Example:{10, 20, 30, 40, 50}
// Output: 40 20 50 10 30
//-----------------------------------------------------------------------------------//

class Node{
    int key;
    Node left, right;

    public Node(int item){
        key = item;
        left = right = null;
    }
}

public class ques10{

    Node root;

    void inOrderTraversal(Node node){
        if(node == null){
            return;
        }

        inOrderTraversal(node.left);

        System.out.print(node.key + " ");

        inOrderTraversal(node.right);
    }


    public static void main(String[] args) {
        ques10 tree = new ques10();

        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);

        tree.inOrderTraversal(tree.root);
        
    }  
}
