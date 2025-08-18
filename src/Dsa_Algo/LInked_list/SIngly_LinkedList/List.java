package Dsa_Algo.LInked_list.SIngly_LinkedList;

public class List {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next= null;
        }
    }

    Node head = null;

    public void addAtBeginning(int data){
        Node new_node = new Node(data);

        if (head == null){
            head = new_node;
        }else {
            new_node.next = head;
            head = new_node;
        }
    }

    public void addAtLast(int data){
        Node new_node = new Node(data);
        Node temp = head;
        if (head == null){
            head = new_node;
        }else{
            while (temp.next !=null){
                temp = temp.next;
            }

            temp.next = new_node;
        }

    }

    public void addAtPosition(int data,int position){
        Node new_node = new Node(data);
        Node temp = head;
        for (int i = 0; i < (position-2); i++) {
            temp= temp.next;
        }
        new_node.next = temp.next;
        temp.next = new_node;
    }

    public void Print(){
        Node temp = head;
        if (head == null){
            System.out.println("List is empty , There is noting to print");
        }else{
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public void deleteAtBeginning(){
        if (head == null){
            System.out.println("No data found ");
        }else{
            head = head.next;
        }
    }

    public void deleteAtLast(){
        Node temp = head;
        Node ptr = temp.next;
        while (ptr.next!=null){
            temp = ptr;
            ptr = ptr.next;
        }
        temp.next = null;
    }

    public void deleteAtPosition(int position){
        Node temp = head;
        Node ptr = temp.next;
        for (int i = 0; i <(position-2) ; i++) {
            temp = ptr;
            ptr = ptr.next;
        }
        temp.next = ptr.next;
    }

    public static void main(String[] args) {

    }
}
