import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class AllMapExamples {
    public static void main(String[] args) throws InterruptedException {
        // 1. HashMap → User Profiles (E-commerce)
        Map<Integer, String> userProfiles = new HashMap<>();
        userProfiles.put(101, "Alice");
        userProfiles.put(102, "Bob");
        userProfiles.put(103, "Charlie");
        userProfiles.put(101, "Alicia"); // overwrites old value
        System.out.println("1. HashMap (User Profiles): " + userProfiles);
        System.out.println("   User 102: " + userProfiles.get(102));
        // 2. LinkedHashMap → LRU Cache (Web Browser)
        Map<String, String> cache = new LinkedHashMap<>();
        cache.put("google.com", "Google Homepage");
        cache.put("github.com", "GitHub Repository");
        cache.put("stackoverflow.com", "Q&A Site");
        System.out.println("2. LinkedHashMap (Cache Order): " + cache);
        // 3. TreeMap → Stock Prices (Trading Platform)
        Map<Integer, String> stockMap = new TreeMap<>();
        stockMap.put(103, "Reliance");
        stockMap.put(101, "Infosys");
        stockMap.put(102, "TCS");
        System.out.println("3. TreeMap (Sorted Stocks): " + stockMap);
        System.out.println("    First Entry: " + ((TreeMap<Integer, String>) stockMap).firstEntry());
        System.out.println("    Last Entry: " + ((TreeMap<Integer, String>) stockMap).lastEntry());
        // 4. ConcurrentHashMap → Banking Transactions (Thread-Safe)
        ConcurrentHashMap<String, Integer> accountBalance = new ConcurrentHashMap<>();
        accountBalance.put("Alice", 1000);
        accountBalance.put("Bob", 1500);
        Runnable task1 = () -> {
            accountBalance.put("Alice", accountBalance.get("Alice") - 200);
        };
        Runnable task2 = () -> {
            accountBalance.put("Bob", accountBalance.get("Bob") + 200);
        };
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("4. ConcurrentHashMap (Balances): " + accountBalance);
    }

}

