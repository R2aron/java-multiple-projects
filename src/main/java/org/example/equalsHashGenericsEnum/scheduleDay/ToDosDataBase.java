package org.example.equalsHashGenericsEnum.scheduleDay;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ToDosDataBase {

   protected static Map<Enum, LinkedList<String>> toDoMap = new HashMap<>();

   static {
       for (DaysOfWeek day : DaysOfWeek.values()) {
           toDoMap.put(day, new LinkedList<String>());
       }
   }


}
