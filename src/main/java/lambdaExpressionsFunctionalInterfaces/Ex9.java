package lambdaExpressionsFunctionalInterfaces;



//Create a functional interface that takes a list of integers and returns a list of integers.
// Use a lambda expression to implement this interface, such that it returns a list containing only the odd numbers from the original list.

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ex9 {
    public static void main(String[] args) {

        List<Integer> listOfIntegers = new ArrayList<>(List.of(25,678,218,6,56,86,89,2,21,4998,261,56,9889,7152356,98,89,56,2,56,89));

        Filter filter = (ls) -> {
            ArrayList<Integer> result = new ArrayList<>();
            ls.forEach(n -> {
                if(n%2!=0)
                result.add(n);
            });
            return result;
        };

        System.out.println(filter.filterOddNumbers(listOfIntegers));
    }

    @FunctionalInterface
    interface Filter{
        List<Integer> filterOddNumbers(List<Integer> ls);
    }


}
