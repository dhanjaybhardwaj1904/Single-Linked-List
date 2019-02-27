import java.util.Scanner;

public class lastInsertSingleLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public lastInsertSingleLinkedList insert(lastInsertSingleLinkedList list, int data) {
        Node temp = new Node(data);
        temp.next = null;
        if (list.head == null) {
            list.head = temp;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = temp;
        }
        return list;
    }

    public void display() {
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        lastInsertSingleLinkedList list = new lastInsertSingleLinkedList();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.addNode(value);
        }
        int insertValue = sc.nextInt();
        list.insert(list, insertValue);
        sc.close();
        list.display();
    }
}