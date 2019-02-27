import java.util.Scanner;

public class positionInsertSingleLinkedList {
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

    public Node InsertNth(Node head, int data, int position) {
        Node n = new Node();
        n.data=data;
        n.next=null;
        if(position==0)
            {
            n.next=head;
            head=n;
            return head;
        }
        Node temp=head;
        for(int i=1;i<position;i++)
            temp=temp.next;
        Node tempNew=temp.next;
        temp.next=n;
        n.next=tempNew;
        return head;
    }

    public static void main(String[] args) {

        positionInsertSingleLinkedList list = new positionInsertSingleLinkedList();

        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        while (value != -1) {
            value = sc.nextInt();
            list.addNode(value);
        }
        int insertValue = sc.nextInt();
        int position = sc.nextInt();
        InsertNth(list, insertValue, position);
        sc.close();
        list.display();
    }
}