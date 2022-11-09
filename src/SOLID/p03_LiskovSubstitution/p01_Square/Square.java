package SOLID.p03_LiskovSubstitution.p01_Square;

import SOLID.p02_OpenClosedPrinciple.p02_DrawingShape.Rectangle;

public class Square extends Rectangle {

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
    }
}
