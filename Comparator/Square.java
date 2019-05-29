package Lession5;

public class Square extends Rectangle {

    //double private side = 1.0;
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled,double side) {
        super(color, filled,side,side);
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    public double getSide() {
        return getWidth();
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setHeight(double height) {
        setSide(height);
    }

    @Override
    public String toString() {
        return "A Square with side = "
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

}
