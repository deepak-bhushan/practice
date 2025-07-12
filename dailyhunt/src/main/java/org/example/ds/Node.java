package org.example.ds;

public class Node {
    int data;
    Node next;
    static int length;

    Node (int data){
        this.data=data;
        this.next=null;
    }

    public static void main(String[] args) {
        Node n=new Node(10);

        n.next=new Node(20);
        n.next=new Node(30);
        n.next.next=new Node(40);
        System.out.println(n.data);
        System.out.println(n.next.data);
        n=null;


    }
}
