package org.example.ds;
/*
 10-13-15-17-21
 10 13-15-17-21
 */
public class CustomLinkedList {
    Node head;

    public Node reverse (Node node){
        Node next=null;
        Node prev=null;
        Node curr=head;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=prev;
        }
         node=prev;
        return node;
    }

}
