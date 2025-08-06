package org.example.equalsHashGenericsEnum;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;
        return age == person.age && Objects.equals(name,person.name);
    }

    @Override
    public  int hashCode()
    {
        return Objects.hash(name,age);
    }
}
