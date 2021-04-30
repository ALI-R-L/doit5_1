public class Circle {

    private double radius;


    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double calculatePerimeter(){
        double peri = 2 * Math.PI * radius;
        return peri;
    }

    public double calculateArea(){

        double area = Math.PI * Math.pow(radius,2);
        return area;

    }

    public void draw(){
        System.out.println("this shape is a circle and its perimeter is :  "+this.calculatePerimeter()+" and its area is : "+this.calculateArea());
    }

    @Override
    public boolean equals(Object obj){

        if (this == obj){
            return true;
        }
        else if(!(obj instanceof Circle)){
            return false;
        }
        Circle circ = (Circle) obj;
        if (radius != circ.getRadius()){
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        String explainShape = "this shape is circle"+"its radius is :"+this.radius;
        return explainShape;
//        return super.toString();
    }


}
