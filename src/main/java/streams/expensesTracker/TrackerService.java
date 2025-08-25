package streams.expensesTracker;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TrackerService {

    private Map<String, Expense> expensesMap = new HashMap<>();

    Scanner input = new Scanner(System.in);

    protected void add(Expense obj) {
        expensesMap.put(obj.getCategory(), obj);
    }

    protected void view() {
        expensesMap.forEach((k, v) -> System.out.println(v.toString()));
    }

    protected void welcome()
    {
        System.out.println("!!!Welcome to your expense Tracker!!!");
        System.out.println("Press m for MENU\n");

        Character c = input.nextLine();
        (c.equals('m') ? menu() : welcome());//de modificat
    }

    protected void edit(Expense expense) {
        Scanner input = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("\n=== Expense Tracker Menu ===");
            System.out.println("Press 1 to edit Category");
            System.out.println("Press 2 to edit name");
            System.out.println("Press 3 to edit price");
            System.out.println("Press 4 to edit time");
            System.out.println("Press 5 to Exit");

            System.out.print("Choose an option: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1: {
                    CategorySetter setter = (str -> expense.setCategory(str));
                    String chosen = setter.selectCategory();
                    setter.set(chosen);
                }
                break;
                case 2: {
                    System.out.println("Enter new name");
                    String str = input.nextLine();
                    expense.setName(str);
                    break;
                }
                case 3: {
                    System.out.println("Enter new price");
                    Double newPrice = input.nextDouble();
                    expense.setPrice(newPrice);
                    break;
                }
                case 4: {
                    System.out.println("Feature not implemented... yet.");
                }
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice ❌");
            }

        }

    }
    public void menu() {
        boolean running = true;

        while (running) {
            System.out.println("\n=== Expense Tracker Menu ===");
            System.out.println("Press 1 to Add Expense");
            System.out.println("Press 2 to View Expenses");
            System.out.println("Press 3 to Edit Expense");
            System.out.println("Press 4 to Exit");

            System.out.print("Choose an option: ");
            int choice = input.nextInt();
            input.nextLine(); // curăță bufferul

            switch (choice) {
                case 1: {
                    System.out.print("Enter expense name: ");
                    String name = input.nextLine();

                    System.out.print("Enter expense price: ");
                    double price = input.nextDouble();
                    input.nextLine();

                    Expense e = new Expense(name, price, LocalDateTime.now());
                    add(e);
                    System.out.println("Expense added ✅");
                    break;
                }
                case 2: {
                    view();
                    break;
                }
                case 3: {
                    System.out.print("Enter expense name to edit: ");
                    String name = input.nextLine();
                    Expense exp = expensesMap.get(name);
                    if (exp != null) {
                        edit(exp);
                    } else {
                        System.out.println("Expense not found ❌");
                    }
                    break;
                }
                case 4:
                    System.out.println("Exiting... 👋");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice ❌");
            }
        }
    }

}
