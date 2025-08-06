package org.example.equalsHashGenericsEnum;

public class Pairs<T,K> {
    T obj1;
    K obj2;

    public Pairs(T obj1, K obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }


    protected T getFirst()
    {
        return obj1;
    }

    protected K getSecond()
    {
        return obj2;
    }

    @Override
    public String toString() {
        return "Pairs{" +
                "obj1=" + obj1 +
                ", obj2=" + obj2 +
                '}';
    }
}
