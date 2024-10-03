class LL {
    Node head; // Reference to head node

    // Make a node class to create nodes
    class Node {
        String data; // Data of node
        Node next; // Reference of next node 

        Node(String data) {
            this.data = data;
            this.next = null; // Currently set next reference as null
        }
    }

    // Method to add new nodes at the first position of the linked list
    public void addFirst(String data) {
        Node newNode = new Node(data); // Create a new node

        // Check if there's already an existing linked list, if yes then add data
        if (head == null) {
            head = newNode;
            return;
        }

        /* If there's already an existing linked list then move the current head and add new node to that place..
        simplified just point new node's next reference to current head and add new node to current head's position */
        newNode.next = head;
        head = newNode;
    }

    // Method to display the linked list
    public void display() {
        Node current = head; // Start from the head by assigning a refrence variable named current
        while (current != null) {
            System.out.print(current.data + " -> "); // Print data of current node
            current = current.next; // Move current to the next node
        }
        System.out.println("null"); // Indicate end of the list
    }
}

public class addFirstLL {
    public static void main(String[] args) {
        // Make an object of LL class to create a linked list
        LL list = new LL();

        // Add some data
        list.addFirst("LinkedList");
        list.addFirst("of");
        list.addFirst("example");
        list.addFirst("is");
        list.addFirst("this");

        // Display linked list
        list.display(); // Output: this -> is -> example -> of -> LinkedList -> null
    }
}
