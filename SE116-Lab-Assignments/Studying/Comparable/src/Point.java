import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;

public class Point implements Comparable<Point> {
    private int x;
    private int y;

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(Point otherPoint) {
        double distance1 = Math.sqrt(this.x*this.x + this.y*this.y);
        double distance2 = Math.sqrt(otherPoint.getX()*otherPoint.getX() + otherPoint.getY()*otherPoint.getY());

        return Double.compare(distance1, distance2); //Ascending
        //return Double.compare(distance2, distance1); //Descending
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

}


class PointDemo {
    public static void main(String[] args) {

        Random random = new Random(System.currentTimeMillis());
        ArrayList<Point> points = new ArrayList<Point>();

        for (int i=0; i<100; i++) {
            points.add(new Point(random.nextInt(0, 101), random.nextInt(0, 101)));
            if (i<10) {System.out.println(points.get(i));}
        }

        Collections.sort(points);
        System.out.println("Sorted");

        for (int i=0; i<10; i++) {
            System.out.println(points.get(i));
        }
    }
}