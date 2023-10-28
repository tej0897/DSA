package linkedList;

public class main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
//        myLinkedList.append(33);
        myLinkedList.printLinkedList();
        System.out.println("Removed value is: "+myLinkedList.removeLast().value);
        myLinkedList.printLinkedList();
        System.out.println(myLinkedList.removeLast());

    }
}
