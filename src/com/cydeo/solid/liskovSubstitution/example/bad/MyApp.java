package com.cydeo.solid.liskovSubstitution.example.bad;

import java.util.Arrays;
import java.util.List;

public class MyApp {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(3);
        rectangle.setWidth(5);

        Rectangle square = new Square();
        square.setHeight(4);

        List<Rectangle> rectangles = Arrays.asList(rectangle, square);

        changeHeightAndWidth(rectangles);

    }

    public static void changeHeightAndWidth(List<Rectangle> rectangles) {

        for (Rectangle rectangle : rectangles) {
            rectangle.setHeight(5);
            rectangle.setWidth(6);
            System.out.println(rectangle.getArea() == 30);
        }

    }

}
