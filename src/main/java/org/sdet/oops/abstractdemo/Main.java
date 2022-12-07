package org.sdet.oops.abstractdemo;

public class Main {
    public static void main(String[] args) {
        GraphicObject circle = new Circle();
        circle.draw();
        circle.resize();
        circle.moveTo(12, 34);

        GraphicObject rectangle = new Rectangle();
        rectangle.draw();
        rectangle.resize();
        rectangle.moveTo(34, 5667);
    }
}
