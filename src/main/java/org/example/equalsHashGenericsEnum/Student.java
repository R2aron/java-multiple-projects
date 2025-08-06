package org.example.equalsHashGenericsEnum;

import java.util.Objects;
import java.util.UUID;

public class Student {
    private String name;
    private  int age;
    private UUID studentID;
    private  String email;

    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.studentID = UUID.randomUUID();
        this.email = email;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(obj == null || obj.getClass() != getClass()) return false;

        Student student = (Student) obj;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name,age,email);
    }



    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentID=" + studentID +
                ", email='" + email + '\'' +
                '}';
    }
}
