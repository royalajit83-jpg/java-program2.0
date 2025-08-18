package Dsa_Algo.LInked_list.Circular_list;

public class Circular_List {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void addAtBeginning(int data){
        Node new_node = new Node(data);
        if (head == null){
            head = new_node;
            tail = new_node;
            new_node.next = head;
        }else{
            new_node.next = head;
            head = new_node;
            tail.next = head;
        }
    }

    public void addAtLast(int data){
        Node new_node = new Node(data);
        if (head == null){
            head = new_node;
            tail = new_node;
            new_node.next = head;
        }else{
            tail.next = new_node;
            new_node.next = head;
            tail = new_node;
        }
    }

    public void addAtPosition(int data,int position){
        Node new_node = new Node(data);
        Node temp = head;
        for (int i = 0; i < (position-2); i++) {
            temp=temp.next;
        }

        new_node.next = temp.next;
        temp.next = new_node;
    }
    public void deleteAtBeginning(){
        if (head == null){
            System.out.println("list is empty");
        }else{
            head = head.next;
            tail.next = head;
        }
    }

    public void deleteAtLast(){
        Node temp = head;
        Node ptr = temp.next;
        while (ptr.next!=null){
            temp = ptr;
            ptr = ptr.next;
        }
        temp.next = head;
        tail=temp;
    }
    public void deleteAtPosition(int position){
        Node temp = head;
        Node ptr = temp.next;
        for (int i = 0; i < (position-2); i++) {
            temp = ptr;
            ptr = temp.next;
        }

        temp.next = ptr.next;
    }

}
