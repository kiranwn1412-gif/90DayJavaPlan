import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceTest {
    private static final int N = 100000; // number of elements
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // 1. Add at End
        long start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            arrayList.add(i);
        }
        long end = System.nanoTime();
        System.out.println("ArrayList Add End: " + (end - start) / 1_000_000 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            linkedList.add(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList Add End: " + (end - start) / 1_000_000 + " ms");

        // 2. Random Access (get)
        start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            arrayList.get(i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList Random Access: " + (end - start) / 1_000_000 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            linkedList.get(i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList Random Access: " + (end - start) / 1_000_000 + " ms");

        // 3. Insert in Middle
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(N / 2, i);
        }
        end = System.nanoTime();
        System.out.println("ArrayList Insert Middle: " + (end - start) / 1_000_000 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(N / 2, i);
        }
        end = System.nanoTime();
        System.out.println("LinkedList Insert Middle: " + (end - start) / 1_000_000 + " ms");

        // 4. Remove from Middle
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.remove(N / 2);
        }
        end = System.nanoTime();
        System.out.println("ArrayList Remove Middle: " + (end - start) / 1_000_000 + " ms");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.remove(N / 2);
        }
        end = System.nanoTime();
        System.out.println("LinkedList Remove Middle: " + (end - start) / 1_000_000 + " ms");
    }
}
