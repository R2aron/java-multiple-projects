package lambdaExpressionsFunctionalInterfaces;


//Create a functional interface with a method that takes a List<String> representing first names and returns a List<String> of those names formatted in uppercase.
// Implement it using a lambda expression.

import java.util.ArrayList;
import java.util.List;

public class Ex10 {
    public static void main(String[] args) {
        List<String> listOfWords = new ArrayList<>(List.of("Andrei", "MIHAI", "George", "ELENA", "Paul", "ANDREEA", "Lucian", "CRISTINA", "David", "IOANA",
                "Florin", "MARIA", "Alex", "STEFAN", "Roxana", "VLAD", "Bianca", "RADU", "Gabriel", "IRINA",
                "Cosmin", "DIANA", "Tudor", "ALINA", "Nicolas"));

        Find finder = ls -> {
            List<String> result = new ArrayList<>();

            ls.forEach(n-> {
                if(n.equals(n.toUpperCase()))
                    result.add(n);
            });
            return result;
        };

        System.out.println(finder.findUppercaseWord(listOfWords));

    }

    @FunctionalInterface
    interface Find{
        List<String> findUppercaseWord(List<String> ls);
    }
}
