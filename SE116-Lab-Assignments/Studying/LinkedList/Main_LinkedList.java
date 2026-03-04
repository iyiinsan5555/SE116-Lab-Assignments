import java.util.LinkedList;

public class Main_LinkedList {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("A");
        linkedList.push("B");
        linkedList.push("C");
        //Currently our linked list acts like a stack
        System.out.println(linkedList);

        linkedList.pop(); //should remove C
        linkedList.pop(); //should remove B

        System.out.println(linkedList); //Should print [A]
        linkedList.clear();
        System.out.println("Linked List has cleared");

        //Not our linked list is going to act like a queue
        linkedList.offer("A"); //enqueue
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");

        System.out.println(linkedList);

        linkedList.poll(); //dequeue, should remove A

        System.out.println(linkedList);

        linkedList.add(2,"A");
        System.out.println(linkedList); //Again linked list uses a zero based indexing


        //Hope, gives memory exception

        int count = Integer.MAX_VALUE;
        int[] memoryExceptionnnn = new int[count]; //there must be a block of free space otherwise, it will give an exception
        // java.lang.OutOfMemoryError

    }
}
