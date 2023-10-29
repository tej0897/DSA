package linkedList;

public class main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(2);
//        myLinkedList.removeLast();
//        myLinkedList.append(33);
        myLinkedList.prepend(1);
        myLinkedList.append(3);
        myLinkedList.append(4);
//        System.out.println("Removed value is: "+myLinkedList.removeLast().value);
//        myLinkedList.printLinkedList();
//        System.out.println(myLinkedList.removeLast());
//        System.out.println("Removed Item is: "+myLinkedList.removeFirst().value);
        // removes 1
//        System.out.println("Removed Item is: "+myLinkedList.removeFirst().value);
        // removes 2
//        System.out.println("Removed Item is: "+myLinkedList.removeFirst());
        // null, if we give removeFirst().value, it'll throw NullPointerException

//        System.out.println("Value of index 0 is: "+myLinkedList.getNodeViaIndex(0).value);

//        System.out.println(myLinkedList.setNodeValueViaIndex(0, 111));

//        myLinkedList.insert(4, 5);

        myLinkedList.remove(2);
        myLinkedList.printLinkedList();
    }
}
