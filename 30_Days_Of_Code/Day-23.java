import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

    static void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        // Create a queue for level-order traversal
        Queue<Node> queue = new LinkedList<>();
        queue.add(root); // Enqueue the root node

        // Loop until there are no more nodes to process
        while (!queue.isEmpty()) {
            // Dequeue the front node
            Node currentNode = queue.poll();
            System.out.print(currentNode.data + " "); // Print the current node's data

            // Enqueue the left and right children if they exist
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }

        // After traversal, you can check if there are more levels
        if (!queue.isEmpty()) {
            System.out.println("\nThere are more levels.");
        }
    }

	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}