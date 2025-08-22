import java.util.ArrayList;
import java.util.Arrays;

public class Day1CollectionArrayList {
    public static void main(String[] args) {
//        List
//        Allows duplicates, preserves insertion order
//        Common implementations:
//        ArrayList → backed by dynamic array, fast random access, slow insert/delete in middle.
//        LinkedList → backed by doubly linked list, fast insert/delete, slower random access.

        ///**  1.Fast random access
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");

             // Random access by index
            // This is constant time O(1) because arrays support direct index lookup.
        System.out.println("Element at index 2: " + list.get(2)); // Cherry


        //**  2.Slow Insert in middle
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        System.out.println("2.Before Insert: " + list2);

        // Insert at index 1
        list2.add(1, "X");
          // Time complexity → O(n) in worst case.
        System.out.println("2.After Insert: " + list2);

        //** 3. Slow Delete in Middle
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        System.out.println("3.Before Delete: " + list3);

        // Remove element at index 1
        list3.remove(1);
        System.out.println("3.After Delete: " + list3); //O(n) operation.

        //Random Access → Fast (O(1)) → get(index)
        //Insert/Delete at End → Fast (Amortized O(1)) → add()
        //Insert/Delete in Middle → Slow (O(n)) → add(index, value), remove(index)
        //***Use ArrayList when you need fast access by index.
        //***ArrayList → Best for random access, not good for middle insert/delete.
    }
}
