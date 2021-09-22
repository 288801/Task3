package ru.vsu.rogachev_egor;

public class Rectangle {
    public double x1;
    public double x2;
    public double y1;
    public double y2;

    public Rectangle(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public boolean isPointInRectangle(double x, double y) {
        if ((x > x1) && (x < x2) && (y < y2) && (y > y1)) {
            return true;
        } else {
            return false;
        }
    }
}
