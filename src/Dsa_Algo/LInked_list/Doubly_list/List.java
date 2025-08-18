package Dsa_Algo.LInked_list.Doubly_list;

public class List {
    public class Node{
        Node next;
        Node prev;
        int data;

        public Node(int data){
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    public void addAtBeginning(int data){
        Node new_node = new Node(data);
        if (head == null){
            head = new_node;
            tail = new_node;
        }else{
            head.prev = new_node;
            new_node.next = head;
            head = new_node;

        }
    }
    public void addAtLast(int data){
        Node new_node = new Node(data);
        tail.next = new_node;
        new_node.prev=tail;
        tail = new_node;

    }

    public void addAtPosition(int data,int position){
        Node new_node = new Node(data);
        Node temp = head;
        Node ptr = temp.next;
        for (int i = 0; i < (position-2); i++) {
            temp = ptr;
            ptr = ptr.next;
        }
        new_node.next = ptr;
        new_node.prev = temp;
        temp.next = new_node;
        ptr.prev = new_node;

    }

    public void deleteAtBeginning(){
        if (head == null){
            System.out.println("no data found");
        }else{
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteAtLast(){
        Node temp = tail.prev;
        temp.next = null;
        tail = temp;
    }

    public void deleteAtPosition(int position){
        Node temp = head;
        Node ptr = temp.next;
        for (int i = 0; i < (position-2); i++) {
            temp = ptr;
            ptr = ptr.next;
        }

        temp.next = ptr.next;
        ptr.next.prev = temp;
    }

    public void Print(){
        Node temp = head;
        do {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }while (temp!=null);
    }
}
