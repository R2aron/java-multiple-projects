package org.example.equalsHashGenericsEnum.scheduleDay;

import java.util.Scanner;

public class ScheduleService {

    Scanner input = new Scanner(System.in);

    protected ScheduleService() {
        System.out.println("Constructor created");
    }
    protected void getDays()
    {
        for(DaysOfWeek day : DaysOfWeek.values())
        {
            System.out.println(day);
        }
    }

    protected Enum selectDay()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Press 1 to select Monday\n");
        sb.append("Press 2 to select Tuesday\n");
        sb.append("Press 3 to select Wednesday\n");
        sb.append("Press 4 to select Thursday\n");
        sb.append("Press 5 to select Friday\n");
        sb.append("Press 6 to select Saturday\n");
        sb.append("Press 7 to select Sunday\n");

        System.out.println(sb);

        int dayChosen = input.nextInt();
        input.nextLine();
        switch (dayChosen)
        {
            case 1:
                return DaysOfWeek.MONDAY;
            case 2:
                return DaysOfWeek.TUESDAY;
            case 3:
                return DaysOfWeek.WEDNESDAY;
            case 4:
                return DaysOfWeek.THURSDAY;
            case 5:
                return DaysOfWeek.FRIDAY;
            case 6:
                return DaysOfWeek.SATURDAY;
            case 7:
                return DaysOfWeek.SUNDAY;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
                return null;
        }
    }

    protected void addToDo(Enum selectedDay,String toDo)//selectedDay vine din metoda selectDay()
    {
        ToDosDataBase.toDoMap.get(selectedDay).add(toDo);
    }

    protected String getToDoText()
    {
        System.out.println("Enter your To Do: ");
        String result = input.nextLine();

        return result;
    }

    }

