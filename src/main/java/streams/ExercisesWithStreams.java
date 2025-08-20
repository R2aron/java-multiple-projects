package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExercisesWithStreams {
    public static void main(String[] args) {

//        Given a list of integers, create a new list that contains only the even numbers. Use streams to achieve this.
        List<Integer> integers = new ArrayList<>(List.of(42, 7, 19, 85, 33, 60, 12, 98, 26, 3, 71));
        List<Integer> onlyEvenNumbers = integers.stream()
                .filter(number -> (number % 2 == 0))
                .collect(Collectors.toList());

        System.out.println("List of even numbers: ");
        System.out.println(onlyEvenNumbers);



//         Using a list of strings, find and print the longest string using Java streams. (Input: List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");)
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        String longestOne = strings.stream()
                        .reduce("",(s1,s2) -> s1.length() > s2.length() ? s1 : s2);
        System.out.println("Longest string is: " +longestOne);

//         Create a stream of numbers from 1 to 100 and use the filter operation to retain only those numbers which are prime.
        ssss isPrime = (n) -> {
            if (n <= 1) return false;
            if (n == 2) return true;
            if (n % 2 == 0) return false;

            for (int i = 3; i * i <= n; i += 2) {
                if (n % i == 0) return false;
            }
            return true;
        };


        List<Integer> evennumbers = Stream.iterate(1, n -> n+1)
                .filter(isPrime::isPrime)
                .limit(100)
                .collect(Collectors.toList());

        System.out.println(evennumbers);


//        Given a list of strings, use streams to create a single string which is a concatenation of all strings separated by a comma. (Input: List<String> strings = Arrays.asList("one", "two", "three", "four");)
        List<String> strings1 =Arrays.asList("one", "two", "three", "four");
        String singleString = strings1.stream()
                .collect(Collectors.joining(","));
        System.out.println(singleString);

//        Given a list of people with attributes: first name, last name, and age; use streams to find all people who are older than 18 years.
        List<PersonFromStreams> people = Arrays.asList(new PersonFromStreams("Alice", "Johnson", 20), new PersonFromStreams("Bob", "Smith", 17));
        List<PersonFromStreams> atLeast18 = people.stream()
                .filter(PersonFromStreams::isOldEnough)
                .collect(Collectors.toList());

        System.out.println(atLeast18);


//        Create a stream of integers from an array and find the sum of all integers using the reduce method. (Input: Integer[] numbers = {1, 2, 3, 4, 5};)
        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int sum = Arrays.stream(numbers)
                .reduce(0, Integer::sum);

        System.out.println(sum);

//         Use streams to transform a list of strings into a list of their respective lengths. (Input: List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");)
        List<String> strings2 = Arrays.asList("Hello", "World", "Java", "Streams");
        List<Integer> lengthOfStrings = strings2.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(lengthOfStrings);

//        Given a string, use streams to count the number of vowels in it. (Input: String sentence = "Hello World";)
        String sentence = "Given a string, use streams to count the number of vowels in it. (Input: String sentence = Hello World)";
        long numberOfvowels = sentence.chars()
                .filter(c-> "aeiouAEIOU".indexOf(c)>=0)
                        .count();
        System.out.println("Number of vowels in sentence: " +numberOfvowels);


//        Given a list of sentences, use flatMap to create a list of all words in all the sentences, and then find the most frequently occurring word. (Input: List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java");)
        List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java");
        String mostFreqWord = sentences.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .collect(Collectors.groupingBy(
                        w -> w, Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println("Most frequent word: "+mostFreqWord);

//        Using streams, find the total number of characters across a list of strings excluding whitespace characters. (Input: List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");)
        List<String> strings3 = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");
        long totalNmbrChar = strings3.stream()
                .flatMapToInt(String::chars)
                .filter(Character::isAlphabetic)
                .count();

        System.out.println("Totoal number of characters in list: "+totalNmbrChar);

    }
    @FunctionalInterface
    interface ssss{
        boolean isPrime(int n);
    }


    /*Create a stream from a text file and use stream operations to find and print the longest word in the file.
    Given a list of employee objects with attributes: name, department, and salary; find the department with the highest total salary.
    Using a stream of strings representing numbers (e.g., "1", "2", "3"), convert them to integers and find the product of all numbers using reduce. (Input: List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");)
    Given a list of products with attributes: name, category, and price; find the category with the highest average price.
    Given a list of books with attributes: title, author, and year of publication; use streams to find all the books published before the year 2000 and group them by author in a map where the key is the author and the value is a list of titles of their books.

    !!!TO BE CONTINUED!!!

     */


}
