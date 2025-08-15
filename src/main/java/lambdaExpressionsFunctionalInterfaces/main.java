import java.util.*;

public class main {
    public static void main(String[] args) {
        // Test pentru filtrarea numerelor pare
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5,999, 6, 7, 8));
        ArrayList<Integer> evenNumbers = filterEvenNumbers(numbers);
        System.out.println("Even numbers: " + evenNumbers);

        // Test pentru sortarea cuvintelor
        ArrayList<String> words = new ArrayList<>(Arrays.asList(
                "Papaya", "Fig", "Honeydew", "Lemon", "Quince",
                "Apple", "Mango", "Date", "Cherry", "Kiwi",
                "Grape", "Banana", "Orange", "Nectarine", "Elderberry"
        ));
        sortStrings(words);

        // Test pentru interfață funcțională
        MaxValue maxVal = (list) -> Collections.max(list);
        System.out.println("Max value: " + maxVal.maximValue(numbers));


        // Create a functional interface with a method that takes two strings as input and returns an integer. Implement this interface using a lambda expression to create a custom comparator that compares strings based on their length (not lexicographically).
        String str1 ="123456789";
        String str2 = "12345";
        LongestString compare = (s1, s2) -> {
            return (s1.length()>s2.length()) ? s1.length() : s2.length();
        };
        System.out.println(compare.compareStringLenght(str2,str1));


        // Create a functional interface that takes a string and an integer n as parameters and returns a string. Implement it using a lambda expression that returns the first n characters of the string.
        // If n is larger than the length of the string, it should return the full string.
        firstNCharacters firstCharacters = (str, n) -> {
            return (n>str.length()) ? str : str.substring(0,n);
        };
        Integer n = 10;
        String str = "Ana are mere si portocale";
        System.out.println(firstCharacters.getfirstNCharacrters(str,n));












    }

    // Filtrare numere pare folosind lambda
    protected static ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        list.forEach(n -> {
            if (n % 2 == 0) {
                evenNumbers.add(n);
            }
        });
        return evenNumbers;
    }

    // Sortare lista de stringuri
    protected static void sortStrings(ArrayList<String> list) {
        list.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
        System.out.println("Sorted strings:");
        list.forEach(System.out::println);
    }

    //Create a functional interface that takes a list of integers and returns the maximum value from the list. Implement this interface using a lambda expression. Ensure your lambda correctly handles an empty list case.
    @FunctionalInterface
    interface MaxValue {
        Integer maximValue(List<Integer> list);
    }

    @FunctionalInterface
    interface LongestString {
        Integer compareStringLenght(String s1, String s2);
    }

    @FunctionalInterface
    interface firstNCharacters {
        String getfirstNCharacrters (String str, Integer n);
    }
    }






