import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class AllSetExamples {
    public static void main(String[] args) throws InterruptedException {

        // 1. HashSet → Unique Customer IDs (E-commerce)
        Set<String> customerIds = new HashSet<>();
        customerIds.add("C101");
        customerIds.add("C102");
        customerIds.add("C103");
        customerIds.add("C101"); // duplicate ignored
        System.out.println("1. HashSet (Unique Customer IDs): " + customerIds);

        // 2. LinkedHashSet → Browsing History (Web Browser)
        Set<String> urls = new LinkedHashSet<>();
        urls.add("google.com");
        urls.add("github.com");
        urls.add("google.com"); // duplicate ignored
        urls.add("stackoverflow.com");
        System.out.println("2. LinkedHashSet (Browsing History): " + urls);

        // 3. TreeSet → Stock Prices (Sorted)
        Set<Integer> stockPrices = new TreeSet<>();
        stockPrices.add(450);
        stockPrices.add(320);
        stockPrices.add(600);
        stockPrices.add(450); // duplicate ignored
        System.out.println("3. TreeSet (Stock Prices Sorted): " + stockPrices);
        System.out.println("   Lowest Price: " + ((TreeSet<Integer>) stockPrices).first());
        System.out.println("   Highest Price: " + ((TreeSet<Integer>) stockPrices).last());

        // 4. ConcurrentSkipListSet → Game Leaderboard (Multi-threaded)
        ConcurrentSkipListSet<Integer> scores = new ConcurrentSkipListSet<>();

        Runnable player1 = () -> {
            scores.add(1200);
            scores.add(1500);
            scores.add(1800);
        };

        Runnable player2 = () -> {
            scores.add(1100);
            scores.add(1900);
            scores.add(1700);
        };

        Thread t1 = new Thread(player1);
        Thread t2 = new Thread(player2);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("4. ConcurrentSkipListSet (Leaderboard Asc): " + scores);
        System.out.println("   ConcurrentSkipListSet (Leaderboard Desc): " + scores.descendingSet());
        System.out.println("   Top Score: " + scores.last());
    }
}
