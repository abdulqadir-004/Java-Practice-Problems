import java.util.Scanner; //import scanner class for input
class LL {
    Node head; //create a head node

    class Node{
        int data; //integer type data
        Node next; //pointer variable for next node

        Node(int data){
            this.data = data;
            this.next = null; //inititally set next node to null
        }
    }

    //method to add node in linked list
    public void add(int data){
        Node newNode = new Node(data); //create a new Node
        //if there is no list
        if(head == null){
            head = newNode; //assign head as new Node
        }
        //else add new node to tail of list
        else{
            Node currentNode =  head; //make a pointer variable for itteration, that points to the current node
            while(currentNode.next != null){
                currentNode = currentNode.next; //itirate
            }
            currentNode.next = newNode; //add new node at last of list, before null
        }
    }

    //method to specifically add Node at first of LinkedList
    public void addfirst(int data){
        Node newNode = new Node(data); //create an instance of Node class or create a new Node

        //if head is null then add newNode at head
        if(head == null){
            head = newNode;
        }
        //else if head is not null and there's an existing linkedlist already
        newNode.next = head; //assgin newNode's next to current head
        head = newNode; //assign newNode as head
    }

    //method to specifically add Node at last of LinkedList
    public void addlast(int data){
        Node newNode = new Node(data); //create an instance of Node class

        //if head is null then add newNode at head
        if(head == null){
            head = newNode;
        }

        Node currentNode = head; //make a pointer variable for itteration, that points to the current node
        while(currentNode.next != null){
            currentNode = currentNode.next; //traverse untill null encountered
        }
        currentNode.next = newNode; //add new node at current node's next, before null
    }

    //mehthod to remove first node from linked list
    public void removefirst(){
        //if there is no head show list is empty
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        //if list contains only one node
        if(head.next == null){
            head = null; //assign head to null
            return;
        }
        //if list contains many nodes, assign 2nd node as head
        head = head.next;
    }

    //mehtod to remove last node from linked list
    public void removelast(){
        //if there is no head show list is empty
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        //if list contains only one node
        if(head.next == null){
            head = null; //assign head to null
            return;
        }
        //if list contains many nodes
        Node last = head.next;
        Node  secLast = head;
        while(last.next != null){
            last = last.next;
            secLast = secLast.next;
        }
        secLast.next = null; //assign secLast's next to null
    }

    //method to reverse a linked list
    public void reverseLL(){
        Node currentNode = head; //make a pointer variable for itteration, that points to the current node
        Node prevNode = null; //pointer variable for previous node, initially null

        while(currentNode != null){
            Node tempNode = currentNode.next; //create a temp node and assign to currentNode's next node
            currentNode.next = prevNode; //point currentNode to the previous node
            prevNode = currentNode; //itirate previousNode to currentNode
            currentNode = tempNode; //itirate currentNode to next node or tempNode
        }
       head = prevNode; //assign head as previous node, reversed
    }

    //method to display linked list
    public void display(){
        Node currentNode = head; //make a pointer variable for itteration, that points to the current node

        while(currentNode != null){
            System.out.print(currentNode.data+" -> "); //print the current node
            currentNode = currentNode.next; //traverse until currentNode's next node is null
        }
        System.out.println("null"); //show end of linked list, as null
    }
}

public class LLOperations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //create a new scanner for input
        LL list = new LL(); //create a new list

        //add some elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //show the list
        System.out.println("Normal Linked List");
        list.display();

        //show reversed list
        System.out.println("Reversed Linked List");
        list.reverseLL();
        list.display();

        //ask which node to remove form normal linked list
        list.reverseLL();
        System.out.println("Which node to remove form normal linked list (1- First 2- Last)");
        int delNode = sc.nextInt();
        while(delNode < 1 || delNode > 2){
            System.out.println("choose only 1 or 2: ");
        }

        switch(delNode){
            case 1:
            list.removefirst();
            break;

            case 2:
            list.removelast();
            break;
        }
        
        //show linked list after deleting elements
        System.out.println("Linked list after deleting elements: ");
        list.display();
    }
}
