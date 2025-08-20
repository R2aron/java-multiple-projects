package streams.expensesTracker;

import java.time.LocalDateTime;

public class TrackExpensesApp {
    public static void main(String[] args) {

//        Expense exp1 = new Expense("Banana",.39, LocalDateTime.now());

        TrackerService service = new TrackerService();
        service.menu();


    }
}
