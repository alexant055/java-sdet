package org.sdet.oops.abstractdemo;

public abstract class GraphicObject {
    int x, y;

    void moveTo(int newX, int newY) {
        System.out.println(newX + " " + newY);
    }

    abstract void draw();

    abstract void resize();
}
