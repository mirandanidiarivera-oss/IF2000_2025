package domain;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LogBook {
    private static int eventCounter = 1;
    private List<String> events = new ArrayList<>();

    public void addEvent(String eventType, Account account) {
        String record = "EventID: " + eventCounter++
                + " | Event: " + eventType
                + " | Date: " + LocalDateTime.now()
                + " | Account: " + account.toString();
        events.add(record);
    }

    public void showEvents() {
        for (String e : events) {
            System.out.println(e);
        }
    }
}