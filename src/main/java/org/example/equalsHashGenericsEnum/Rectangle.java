package org.example.equalsHashGenericsEnum;

import java.util.Objects;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }



    @Override
    public boolean equals(Object obj)
    {
        if ( this == obj)
            return true;
        if(obj == null || obj.getClass() != getClass())
            return false;

        Rectangle rectangle =(Rectangle) obj;
        return  Objects.equals(width, rectangle.width) && Objects.equals(height,rectangle.height);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(width,height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }


}
