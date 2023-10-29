package linkedList;

public class main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(2);
//        myLinkedList.removeLast();
//        myLinkedList.append(33);
        myLinkedList.prepend(1);
//        System.out.println("Removed value is: "+myLinkedList.removeLast().value);
//        myLinkedList.printLinkedList();
//        System.out.println(myLinkedList.removeLast());
        System.out.println("Removed Item is: "+myLinkedList.removeFirst().value);
        // removes 1
        System.out.println("Removed Item is: "+myLinkedList.removeFirst().value);
        // removes 2
        System.out.println("Removed Item is: "+myLinkedList.removeFirst());
        // null, if we give removeFirst().value, it'll throw NullPointerException




    }
}
