package lambdaExpressionsFunctionalInterfaces;

//Create a functional interface that is generic and takes a list of generic items and a single generic item, returning a boolean indicating whether the item is in the list.
// Implement this interface using a lambda expression.

import java.util.ArrayList;
import java.util.List;

public class Ex11 {
    public static void main(String[] args) {

        List<Character> chList = new ArrayList<>(List.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'ă', 'â', 'î', 'ș', 'ț',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'Ă', 'Â', 'Î', 'Ș', 'Ț'));

        Validate validator = (ls, item) -> {
            for (Object n : ls)
                if (n.equals(item)) {
                    return true;
                }
            return false;
        };


        System.out.println(validator.isInTheList(chList, '!'));
        System.out.println(validator.isInTheList(chList, 'N'));


    }


    @FunctionalInterface
    interface Validate <T>{
        boolean isInTheList(List<T> ls, T item);
    }

    }
