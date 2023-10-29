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
        Node temp = head;
        Node pre=head;

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

    public void prepend(int value){
        Node newNode = new Node(value);

        if (length==0){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if (length ==0){
            return null;    //empty scenario
        }
        Node temp = head;
        head = head.next;   //normal scenario
        temp.next = null;
        length--;
        if (length ==0){
            tail = null;    //one node scenario
        }
        return temp;
    }

    public Node getNodeViaIndex(int index){
        Node temp = head;
        if (index < 0 || index > length){
            return null;
        }
        for (int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public Boolean setNodeValueViaIndex(int index, int value){
        Node temp = getNodeViaIndex(index);
        if (temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public Boolean insert(int index, int value){

        if (index < 0 || index > length){
            return false;
        }
        if (index == 0){
            prepend(value);
            return true;
        }
        if (index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = getNodeViaIndex(index-1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

}
