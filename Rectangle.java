import java.util.ArrayList;

public class Rectangle {

    private ArrayList<Integer> sides;

    /**
     * construct a rectangle object with 4 given sides .
     * @param a
     * @param b
     * @param c
     * @param d
     */
    public Rectangle(int a,int b,int c,int d){
        sides = new ArrayList<Integer>();
        sides.add(a);
        sides.add(b);
        sides.add(c);
        sides.add(d);

    }

    /**
     * Get sides field.
     * @return
     */
    public ArrayList<Integer> getSides() {
        return sides;
    }

    /**
     *hecks if it is a square or not.
     * @return boolean , this is true if sizes of all side are equal.
     */
    public boolean isSquare(){

        if (sides.get(0) == sides.get(1) && sides.get(1) == sides.get(2) && sides.get(2)== sides.get(3)){
//            System.out.println("this is square");
            return true;
        }
//        System.out.println("this is not square ");
        return false;
    }

    /**
     *
     * @return
     */
    public double calculatePerimeter(){
        double peri = sides.get(0)+sides.get(1)+sides.get(2)+sides.get(3);
        return peri;
    }

    public double calculateArea(){

        if (this.isSquare()){
            return Math.pow(sides.get(0),2);
        }
        else {
            return sides.get(0) * sides.get(1);
        }

    }

    public void draw(){
        System.out.println("this shape is a rectangle and its perimeter is :  "+this.calculatePerimeter()+" and its area is : "+this.calculateArea());
    }

    @Override
    public boolean equals(Object obj){

        if (this == obj){
            return true;
        }
        else if(!(obj instanceof Rectangle)){
            return false;
        }
        Rectangle rect = (Rectangle) obj;
        if (!getSides().equals(rect.getSides())){
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        String explainShape = "this shape is rectangle"+"its sides are :"+sides.get(0)+" ,"+sides.get(1)+" ,"+sides.get(2)+" ,"+sides.get(3);
        return explainShape;
//        return super.toString();
    }
}
