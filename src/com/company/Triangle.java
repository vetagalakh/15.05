package com.company;

public class Triangle {

    private Point a, b, c;

    public Triangle() {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public void square() {

        int ab = Point.distance(a, b);
        int bc = Point.distance(b, c);
        int ac = Point.distance(a, c);
        int s = (ab + bc + ac);
    }
}
