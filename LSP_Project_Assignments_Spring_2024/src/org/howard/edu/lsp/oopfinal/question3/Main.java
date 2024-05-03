package org.howard.edu.lsp.oopfinal.question3;

public class Main {
    public static void main(String[] args) {
        Shape circle = createShape("Circle");
        if (circle != null) {
            circle.draw();
        }

        Shape rectangle = createShape("Rectangle");
        if (rectangle != null) {
            rectangle.draw();
        }
    }

    public static Shape createShape(String type) {
        if ("Circle".equalsIgnoreCase(type)) {
            return new Circle();
        } else if ("Rectangle".equalsIgnoreCase(type)) {
            return new Rectangle();
        }
        return null;
    }
}
