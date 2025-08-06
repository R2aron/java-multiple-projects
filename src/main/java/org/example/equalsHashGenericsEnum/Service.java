package org.example.equalsHashGenericsEnum;

public class Service {

//    Create a generic method to swap the positions of two elements in an array.
    protected <T> void swapPositions(T[] arr, int i, int j) {
        T man;
        man = arr[i];
        arr[i] = arr[j];
        arr[j] = man;
    }
}
