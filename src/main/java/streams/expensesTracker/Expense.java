package streams.expensesTracker;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Expense {
    private String Category;
    private String name;
    private double price;
    private LocalDateTime dateTime ;

    public Expense(String name, double price, LocalDateTime dateTime) {
        this.name = name;
        this.price = price;
        this.dateTime = dateTime;
        CategorySetter setter = (str -> this.Category = str);
        String chosen = setter.selectCategory();
        setter.set(chosen);
    }






    public void setCategory(String category) {
        Category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getCategory() {
        return Category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "Category='" + Category + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", dateTime=" + dateTime +
                '}';
    }
}

@FunctionalInterface
interface CategorySetter{
    void set(String cat);


    default String selectCategory()
    {
        boolean ok = true;
        while(ok) {

            ok = false;

            System.out.println("/n=== Expense Categories ===");
            System.out.println("---Select your category---");
            System.out.println("Press 1 to select: Food");
            System.out.println("Press 2 to select: Transportation");
            System.out.println("Press 3 to select: Entertainment");
            System.out.println("Press 4 to select: Utilities");
            System.out.println("Press 5 to select: Healthcare");
            System.out.println("Press 0 to add another one");


            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("You selected: Food 🍔");
                    return Category.FOOD.toString();
                case 2:
                    System.out.println("You selected: Transportation 🚗");
                    return Category.TRANSPORTATION.toString();
                case 3:
                    System.out.println("You selected: Entertainment 🎬");
                    return Category.ENTERTAIMENT.toString();
                case 4:
                    System.out.println("You selected: Utilities 💡");
                    return Category.UTILITIES.toString();
                case 5:
                    System.out.println("You selected: Healthcare 🏥");
                    return Category.HEALTHCARE.toString();
                default: {
                    System.out.println("Invalid choice ❌");
                    ok = true;
                }
            }

        }
        return "";
    }

}
