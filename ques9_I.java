//Write a Java program to get the preorder traversal of the values of the nodes in a binary tree.
//-----------------------------------------------------------------------------------//
//Example:
//    10
//   /  \
//  20  30
//  / \  
// 40 50 
//-----------------------------------------------------------------------------------//

class NodeI{
    int key;
    NodeI left, right ;

    //Constructor
    public NodeI(int item){
        key = item;
        left = right = null;
    }
}

public class ques9_I{

    void preorderTraversal(NodeI node){
        
        if(node == null){
            return;
        }

        System.out.print(node.key + " ");

        preorderTraversal(node.left);

        preorderTraversal(node.right);
    }
    public static void main(String[] args) {

        ques9_I tree = new ques9_I();

         // Initialize and allocate memory for tree nodes
        NodeI firstNode = new NodeI(10);
        NodeI secondNode = new NodeI(20);
        NodeI thirdNode = new NodeI(30);
        NodeI forthNode = new NodeI(40);
        NodeI fifthNode = new NodeI(50);

        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = forthNode;
        secondNode.right = fifthNode;

        tree.preorderTraversal(firstNode);
         
        
    }
    
}
