package ru.vsu.rogachev_egor;

public class Programm {
    public static final Line L1 = new Line(-1, 8, 15.0 / 6);
    public static final HorizontalParabola HP1 = new HorizontalParabola(1, 1, -1);
    public static final VerticalParabola VP1 = new VerticalParabola(0, 0, 1.0 / 8);
    public static final Rectangle R1 = new Rectangle(1, 5, -2, 0);

    public static SimpleColor getColor(double x, double y) {
        if (L1.isPointAboveLine(x, y) && HP1.isPointLeftOfParabola(x, y)) {
            return SimpleColor.YELLOW;
        }
        if (L1.isPointAboveLine(x, y) && !HP1.isPointLeftOfParabola(x, y) && y > 0) {
            return SimpleColor.ORANGE;
        }
        if (L1.isPointAboveLine(x, y) && !HP1.isPointLeftOfParabola(x, y) && y < 0) {
            return SimpleColor.BLUE;
        }
        if (R1.isPointInRectangle(x, y)) {
            return SimpleColor.GRAY;
        }
        if (!L1.isPointAboveLine(x, y) && HP1.isPointLeftOfParabola(x, y) && VP1.isPointAboveParabola(x, y)) {
            return SimpleColor.BLUE;
        }
        if (!L1.isPointAboveLine(x, y) && HP1.isPointLeftOfParabola(x, y) && !VP1.isPointAboveParabola(x, y)) {
            return SimpleColor.GREEN;
        }
        if (!L1.isPointAboveLine(x, y) && !HP1.isPointLeftOfParabola(x, y) && VP1.isPointAboveParabola(x, y)) {
            return SimpleColor.GREEN;
        }
        return SimpleColor.BLUE;
    }

}
