package examples.object_methods;

public class Point {
    private int x;
    private int y;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }


//    Point(2, 6)    12  68
//    Point(12, 1)   12  373
//    Point(3, 4)    12  97
//    Point(4, 3)    12  127
}
