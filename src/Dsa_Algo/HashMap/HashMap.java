package Dsa_Algo.HashMap;

import java.util.LinkedList;
import java.util.Map;

public class HashMap <K,V>{
    class Node{
        K key;
        V value;

        public Node(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    int n;
    int N;
    LinkedList<Node>[] bucket;

    public HashMap(){
        this.N = 5;
        this.bucket = new LinkedList[N];
        for (int i = 0; i < N; i++) {
            bucket[i] = new LinkedList<>();
        }
    }

    public int HashFunction(K key){
       int bi = key.hashCode();
       return Math.abs(bi) % N;
    }

    public int SearchInArray(K key, int bi){
        LinkedList<Node> ll = bucket[bi];
        for (int i = 0; i < ll.size(); i++) {
            if (ll.get(i).key == key){
                return i;
            }

        }
        return -1;
    }

    public void rehash(){

        LinkedList<Node>[] oldBucket = bucket;
        N = 2*N;
        bucket= new LinkedList[N];
        for (int i = 0; i < N; i++) {
            bucket[i] = new LinkedList<>();
        }

        for (int i = 0; i < oldBucket.length; i++) {
            LinkedList<Node> ll = oldBucket[i];
            for (int j = 0; j < ll.size(); j++) {
                Node node = ll.get(i);
                put(node.key,node.value);
            }

        }

    }

    public void put(K key,V value){
        int bi = HashFunction(key);
        int di = SearchInArray(key,bi);

        if (di == -1){
            bucket[bi].add(new Node(key,value));
            n++;
        }else{
            Node node = bucket[bi].get(di);
            node.value = value;
        }

        double lambda = (double) N/n;

        if (lambda < 2.0){
            rehash();
        }
    }
}
