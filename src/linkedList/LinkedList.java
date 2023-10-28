package linkedList;

import java.security.PrivateKey;

public class LinkedList {
    private Node head;
    private Node tail;
    int length;

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        length = 1;
    }

    public void getHead(){
        System.out.println("Head: " + head.value);
    }

    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }

    public void getLength(){
        System.out.println("length: " +length);
    }

    public void printLinkedList(){
        Node temp = head;
        while(temp!= null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public void append(int value){  //adding to the end of list
        Node myNode = new Node(value);
        if (length==0){
            head = myNode;
            tail = myNode;
        } else {
            tail.next = myNode;
            tail = myNode;
        }
        length ++;
    }

    public Node removeLast(){
        Node temp = head, pre=head;

        if (length == 0){       //no elements in list scenario
            return null;
        }

        while(temp.next != null){   //normal list scenario
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length --;

        if (length == 0){       //one element in list scenario
            head = null;
            tail = null;
        }
        return temp;
    }

}
