import java.util.Scanner;

class SinglyLinkedList {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null; // class-level head pointer

    // Add at beginning
    void addAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add at specific position (1-based index)
    void addAtPos(int data, int pos) {
        if (pos <= 0) {
            System.out.println("Invalid position.");
            return;
        }
        if (pos == 1) {
            addAtHead(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display the list
    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    int getSize(){
        Node temp = head;
        int size = 0;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        return size;
    }
    void deleteAtPos(int pos){
        if(pos<0 || head == null){
            System.out.println("Invalid position or list is empty.");
            return;
        }
        if(pos == 1){
            head = null;
            return;
        }
        Node temp = head;
        for(int i=0;i<pos-1;i++){
            if(temp != null)
                temp = temp.next;
        }
        if(temp == null){
            System.out.println("Position out of bounds.");
            return;
        }
        if(temp.next == null){
            System.out.println("Position out of bounds.");
            return;
        }
        Node del = temp.next;
        temp.next = del.next;
        del.next = null;
        System.out.println("Deleted node with data: " + del.data);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();

        while (true) {
            System.out.println("*********************");
            System.out.println("Singly Linked List");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at specific position");
            System.out.println("4. Display list");
            System.out.println("5. Delete at specific position");
            System.out.println("6. Get size of list");
            System.out.println("7. Exit");
            System.out.println("*********************");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter data: ");
                    int data = sc.nextInt();
                    list.addAtHead(data);
                }
                case 2 -> {
                    System.out.print("Enter data: ");
                    int data = sc.nextInt();
                    list.addAtEnd(data);
                }
                case 3 -> {
                    System.out.print("Enter data: ");
                    int data = sc.nextInt();
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    list.addAtPos(data, pos);
                }
                case 4 -> list.display();
                case 5 -> {
                    System.out.print("Enter position to delete: ");
                    int pos = sc.nextInt();
                    list.deleteAtPos(pos);
                }
                case 6 -> {
                    int size = list.getSize();
                    System.out.println("Size of the list: " + size);
                }
                case 7 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
