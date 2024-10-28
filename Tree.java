//binary tree implementation
import java.util.Scanner;
class Node{
    Node left;//for left node
    Node right;//for right node
    int data;//for data

    public Node(int data){
        this.data = data;
    }
}

public class Tree{
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        //call createTree method to create a Binary Tree
        createTree();
    }

    //method for creating/implementing tree
    static Node createTree(){
        Node root = null;//Initialize a node initially null
        //prompt for data
        System.out.println("Enter Data: ");
        int data = sc.nextInt();
        
        //check if data isn't null (-1)
        if(data == -1){
            return null;
        }
        //else create a new node with data
        root = new Node(data);

        //now ask for root's left and right, recursively
        System.out.println("Enter Left for "+data);
        root.left = createTree();//recursive call

        System.out.println("Enter Right for "+data);
        root.right = createTree();

        return root;
    }
}
/*
explanation for upper code:- so i made a node class with left and right node, made a integer type data type for node's data;
In main class i created a static method to create a binary tree, in that method initially i just created an empty node, asked user for data, checked if it's null
or not if yes then it'll stop at that position that means the recursion call is ended, then asked for left and right for the node recursively.
the process will go on untill user puts "-1" in both left and right node/child nodes, when it's finally done for left nodes means left for last most node is "-1",
then it'll ask for right of that node if right isn't null it'll recursively call the create tree function again, if right of that node is null too then it'll automatically 
go to previous/parent node for it's right- this process is recursive and will go on-
*/