package com.fangfaze.java.study.chapter3.rule8;

import javafx.scene.paint.Color;

public class CombinationColorPoint {
    private final Point point;
    private final Color color;

    public CombinationColorPoint(int x, int y, Color color) {
        if (color == null) {
            throw new NullPointerException();
        }
        this.point = new Point(x, y);
        this.color = color;
    }

    public Point getPoint() {
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof CombinationColorPoint)) {
            return false;
        }
        CombinationColorPoint cp = (CombinationColorPoint) o;
        return cp.point.equals(point) && cp.color.equals(color);
    }
}
