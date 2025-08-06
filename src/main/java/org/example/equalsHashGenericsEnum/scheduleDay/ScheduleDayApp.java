package org.example.equalsHashGenericsEnum.scheduleDay;

import java.util.Scanner;

public class ScheduleDayApp {

    public static void main(String[] args) {
        menu();
    }

    protected static void menu() {

        ScheduleService service = new ScheduleService();
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        sb.append("Press 1 to add task\n");
        sb.append("Press 0 to exit\n");
        //sb.append("Press 2 to see to dos";

        boolean oky = true;
        while (oky) {
            System.out.println(sb);
            System.out.println("Enter your choice:");
            int choice = input.nextInt();
            input.nextLine();
            if (choice == 1) {
                boolean ok =true;
                while (ok) {
                    Enum selectedDay = service.selectDay();
                    if (selectedDay != null)
                    {
                        service.addToDo(selectedDay, service.getToDoText());
                        ok = false;
                        break;
                    }
                }
            } else if (choice == 0) {
                oky = false;
            }
        }
    }
}