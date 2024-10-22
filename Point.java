import java.util.Scanner;

public class Point 
{
    private int x = 0;
    private int y = 0;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public int[] getXY() {
        return new int[] { x, y };
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double distance(Point another) {
        return distance(another.x, another.y);
    }

    public double distance() {
        return distance(0, 0);
    }

    public static void main(String[] args) 
    {
        Scanner inp = new Scanner(System.in);
        Point point1 = new Point();
        Point point2 = new Point();

        System.out.print("Enter first number for first coordinate: ");
        point1.setX(inp.nextInt());
        System.out.print("Enter second number for first coordinate: ");
        point1.setY(inp.nextInt());

        System.out.print("Enter first number for second coordinate: ");
        point2.setX(inp.nextInt());
        System.out.print("Enter second number for second coordinate: ");
        point2.setY(inp.nextInt());

        System.out.println("Point 1: " + point1);
        System.out.println("Point 2: " + point2);

        System.out.println("Distance from first point to (0,0): " + point1.distance());
        System.out.println("Distance from second point to (0,0): " + point2.distance());
        System.out.println("Distance from first point to second point is " + point1.distance(point2));
    }
}