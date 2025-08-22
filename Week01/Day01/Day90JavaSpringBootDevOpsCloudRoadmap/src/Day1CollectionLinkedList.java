import java.util.Arrays;
import java.util.LinkedList;

public class Day1CollectionLinkedList {
    public static void main(String[] args) {
        /*LinkedList is backed by a Doubly Linked List.
        Each element is stored in a Node object.
        Each Node contains:
        data (the value)
        next (pointer to next node)
        prev (pointer to previous node)
        Because of this design:
✅ Insert/Delete in middle is fast (O(1)) – just update pointers.
⚠️ Random Access is slow (O(n)) – must traverse nodes from head or tail.*/

        //*** 1. Fast Insert in Middle
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");

        System.out.println("1. Before Update"+ list1);
        //Insert at index 1
        list1.add(1,"E");
        System.out.println("1.After update"+list1);

       /* ⚡ Internally:
        New node "X" was created.
        "A".next → "X"
        "X".prev → "A", "X".next → "B", "B".prev → "X"
        No shifting of elements like ArrayList.
        Complexity → O(1) (if already at the node).*/

        //*** 2. Fast Delete
        LinkedList<String> list2 = new LinkedList<>(Arrays.asList("A", "B", "C", "D"));
        System.out.println("2.Before Delete: " + list2);

        // Remove element at index 2
        list2.remove(2);
        System.out.println("2.After Delete: " + list2);

       /* ⚡ Internally:
        Node "C" removed."B".next → "D", "D".prev → "B".No shifting needed.
        Complexity → O(1) (if node reference known).*/

        //*** 3. Slow Random Access
        LinkedList<String> list3 = new LinkedList<>(Arrays.asList("Apple", "Banana", "Cherry", "Mango"));

        // Access by index
        System.out.println("Element at index 2: " + list3.get(2));

    }
}
