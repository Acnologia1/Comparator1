package Lession5;

import java.util.Arrays;
import java.util.Comparator;

public class SquareComparatorTest extends RectangleComparator{
    public static void main(String[] args)
    {
        Square[] squares = new Square[3];
        squares[0] = new Square(2.3);
        squares[1] = new Square();
        squares[2] = new Square("yellow", true , 3.8);

        System.out.println("Pre-sorted");
        for(Square square : squares){
            System.out.println(square);
        }

        Comparator squareComparator = new SquareComparator();
        Arrays.sort(squares,squareComparator);

        System.out.println("After-sorted:");
        for(Square square : squares){
            System.out.println(square);
        }
     }
}
