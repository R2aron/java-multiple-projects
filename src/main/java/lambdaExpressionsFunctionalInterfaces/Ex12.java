package lambdaExpressionsFunctionalInterfaces;

//Create a functional interface with a method that takes two strings and returns a string. Implement this interface using a
// lambda expression to create a utility that joins two strings with a space in between.


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class Ex12 {
    public static void main(String[] args) {


        //12
            Concatenation concat = (s1, s2) -> s1 + " " + s2;
            System.out.println(concat.concat("Ana", "Banana"));


        //13
            double me = 789.82;
            SquareRoot square = d -> {return d*d;};
            System.out.println(square.calculateSquare(me));

            //14
        PairMaker<String, Integer> nameAgePairMaker = (str,nr) -> new Pair<>(str,nr);
        Pair<String,Integer> first = nameAgePairMaker.createPair("Andrei",23);
        System.out.println(first);

        //15


        ListFilter<?> listFilter =  (ls, predicate) ->{
            List<Object> firstlist = new ArrayList<>();
            for(Object number:ls)
            {
                if(predicate.test(number))
                    firstlist.add(number);
            }
            return  (List)firstlist;
        };

        List<Integer> nums = new ArrayList<>(List.of(23,2312,1,2,3,4,5,2452,23452));
        Predicate<Object> lessThan10 = n -> ((Integer)n)<10;
        System.out.println(listFilter.filter(nums,lessThan10));
        



    }

    @FunctionalInterface
    interface Concatenation{
        String concat(String s1, String s2);
    }

//    Create a functional interface that takes a single double as a parameter and returns a double.
//    Implement it using a lambda expression to create a utility that returns the square root of the input value.
    @FunctionalInterface
    interface SquareRoot{
        double calculateSquare(double d);
}

//14. Create a functional interface called PairMaker which takes two parameters of type T and U and returns a Pair object that holds both values. The Pair class should be a
// generic class that can hold two values of any types. Your task is to implement the PairMaker using a lambda expression to instantiate Pair objects with the given values.
    @FunctionalInterface
    interface PairMaker<T,U>{
        Pair<T,U> createPair(T par1, U par2);
}

//15. Create a functional interface named ListFilter that works with generics. It should have a method that takes a list of elements of type T and a
// predicate functional interface, applying the predicate to filter elements of the list, returning a new list with elements that satisfy the predicate condition.
// Implement the ListFilter using a lambda expression and demonstrate its usage with different types of lists and predicates.
    @FunctionalInterface
    interface ListFilter<T>{
        List<T> filter(List<? extends T> ls, Predicate<? super T> predicateFunction);
}




}

class Pair <T,U>{
    protected T obj;
    protected U o;

    protected Pair(T obj, U o)
    {
        this.obj = obj;
        this.o = o;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "obj=" + obj +
                ", o=" + o +
                '}';
    }
}
