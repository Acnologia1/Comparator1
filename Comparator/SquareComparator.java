package Lession5;

import Interface.Comparator;

public class SquareComparator extends RectangleComparator implements Comparator<Square> {




    @Override
    public int compare(Square s1, Square s2) {
        if(s1.getSide() > s2.getSide()) return 1;
        else if (s1.getSide() < s2.getSide()) return -1;
        else return 0;
    }
}
