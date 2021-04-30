import java.util.ArrayList;

public class Triangle {

    private ArrayList<Integer> sides;

    public Triangle(int a,int b,int c){
        sides = new ArrayList<Integer>();
        sides.add(a);
        sides.add(b);
        sides.add(c);

    }


    public ArrayList<Integer> getSides() {
        return sides;
    }

    public boolean isEquilateral(){

        if (sides.get(0)==sides.get(1) && sides.get(1)==sides.get(2)){
            return true;
        }
        return false;
    }


    public double calculatePerimeter(){
        double peri = sides.get(0)+sides.get(1)+sides.get(2);
        return peri;
    }

    public double calculateArea(){

        double p = (this.calculatePerimeter())/2;
        return Math.sqrt(p*(p-sides.get(0))*(p-sides.get(1))*(p-sides.get(2)));

    }

    public void draw(){
        System.out.println("this shape is a triangle and its perimeter is :  "+this.calculatePerimeter()+" and its area is : "+this.calculateArea());
    }

    @Override
    public boolean equals(Object obj){

        if (this == obj){
            return true;
        }
        else if(!(obj instanceof Triangle)){
            return false;
        }
        Triangle tri = (Triangle) obj;
        if (!getSides().equals(tri.getSides())){
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        String explainShape = "this shape is triangle"+"its sides are :"+sides.get(0)+" ,"+sides.get(1)+" ,"+sides.get(2);
        return explainShape;
//        return super.toString();
    }
}
