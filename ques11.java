//Write a Java program to get the Postorder traversal of its nodes' values in a binary tree.
//     10
//    / \
//   20   30
//  / \
// 40   50
// Output: 40 50 20 30 10 
//-----------------------------------------------------------------------------------//

class Node{
    int key;
    Node left, right;

    public Node(int item){
        key = item;
        left = right = null;

    }
}


public class ques11 {

    Node root;

    void Postorder(Node node){
        if(node == null){
            return;
        }

        Postorder(node.left);

        Postorder(node.right);

        System.out.print(node.key + " ");

    }

    public static void main(String[] args) {
        ques11 tree = new ques11();

        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);

        tree.Postorder(tree.root);


    }
    
}
