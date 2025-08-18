package Dsa_Algo.Stack;

public class Stack_Array {
    int top = -1;
    int size = 5;
    int[] arr = new int[size];


    public void push(int data){
        if (arr[top] == size-1){
            System.out.println("stach limit reached");
        }else{
            top++;
            arr[top] = data;
        }
    }

    public void pop(){
        if (arr[top] == -1){
            System.out.println("stack is empty");
        }else{
            top--;
        }
    }

    public void print(){
        for (int i = top; i <=0; i--) {
            System.out.print(arr[i] +" ");
        }
    }
}
