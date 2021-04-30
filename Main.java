import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*
        Paint paint = new Paint();
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        ArrayList<Triangle> triangles = new ArrayList<Triangle>();
        ArrayList<Circle> circles = new ArrayList<Circle>();

        Rectangle rectangle1 = new Rectangle(2,3,2,3);
        Rectangle rectangle2 = new Rectangle(4,4,4,4);

        Triangle triangle1 = new Triangle(3,4,5);
        Triangle triangle2 = new Triangle(6,6,6);

        Circle circle1 = new Circle(2.5);
        Circle circle2 = new Circle(1);
  */
        Circle circle1 = new Circle(19);
        Circle circle2 = new Circle(3);
        Rectangle rect1 = new Rectangle(1,4,1,4);
        Rectangle rect2 = new Rectangle(8,5,8,5);
        Rectangle rect3 = new Rectangle(6,6,6,6);
        Triangle tri1 = new Triangle(2,2,2);
        Triangle tri2 = new Triangle(4,4,6);
        Paint paint = new Paint();
        paint.addCircle(circle1);
        paint.addCircle(circle2);
        paint.addRectangle(rect1);
        paint.addRectangle(rect2);
        paint.addRectangle(rect3);
        paint.addTriangle(tri1);
        paint.addTriangle(tri2);
        paint.drawAll();
        paint.printAll();
    }
}
