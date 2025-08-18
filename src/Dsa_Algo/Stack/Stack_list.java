package Dsa_Algo.Stack;

public class Stack_list {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
    }

    Node top = null;

    public void push(int data){
        Node new_node = new Node(data);
        if (top == null){
            top = new_node;
        }else{
            new_node.next = top;
            top = new_node;
        }
    }


    public void pop(){
       top = top.next;
    }

    public void display(){
        Node temp = top;
        while (temp!=null){
            System.out.print(temp.data);
            temp = temp.next;;
        }
    }

}
