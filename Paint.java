import java.util.ArrayList;
import java.util.Iterator;

public class Paint {

    private ArrayList<Triangle> triangle;
    private ArrayList<Rectangle> rectangle;
    private  ArrayList<Circle> circle;
    /**
     * Construct a new paint object .
     */
    public Paint() {
        triangle = new ArrayList<Triangle>();
        rectangle = new ArrayList<Rectangle>();
        circle = new ArrayList<Circle>();


    }

    /**
     * Add a new triangel to list of triangles.
     * @param shape
     */
    public void addTriangle(Triangle shape){
        triangle.add(shape);
    }

    /**
     * Add a new rectangle to list of rectangles.
     * @param shape
     */
    public void addRectangle(Rectangle shape){
        rectangle.add(shape);

    }

    /**
     * Add a new circle to list of circles.
     * @param shape
     */
    public void addCircle(Circle shape){
        circle.add(shape);
    }

    /**
     * Call draw method on all the shapes in the array list
     */
    public void drawAll(){
        Iterator<Triangle> tri = triangle.iterator();
        Iterator<Rectangle> rect = rectangle.iterator();
        Iterator<Circle> circ = circle.iterator();

        System.out.println("triangles in drawAll: ");
        while (tri.hasNext()){
            tri.next().draw();
        }

        System.out.println("rectangles in drawAll: ");
        while (rect.hasNext()){
            rect.next().draw();
        }

        System.out.println("circles in drawAll: ");
        while (circ.hasNext()){
            circ.next().draw();
        }


    }
    /**
     * this method prints shapes tostring information .
     */
    public void printAll(){
        Iterator<Triangle> tri = triangle.iterator();
        Iterator<Rectangle> rect = rectangle.iterator();
        Iterator<Circle> circ = circle.iterator();

        System.out.println("triangles in printAll: ");
        while (tri.hasNext()){
            System.out.println(tri.next().toString());
        }

        System.out.println("rectangles in printAll: ");
        while (rect.hasNext()){
            System.out.println(rect.next().toString());
        }

        System.out.println("circles in printAll: ");
        while (circ.hasNext()){
            System.out.println(circ.next().toString());
        }
    }


}
