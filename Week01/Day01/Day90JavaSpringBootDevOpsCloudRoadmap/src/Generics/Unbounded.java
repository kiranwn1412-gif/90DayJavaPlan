package Generics;

import java.util.Arrays;
import java.util.List;

public class Unbounded {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Alice", "Bob", "Charlie");
        List<Integer> empIds = Arrays.asList(101, 102, 103);

        System.out.println("Employee Names:");
        printList(employees);

        System.out.println("Employee IDs:");
        printList(empIds);
    }

}
