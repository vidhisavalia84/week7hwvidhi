package week7;

public class Wall {
    public static void main(String[] args) {
       /* Wall obj = new Wall();
        Wall obj1 = new Wall(5, 4);
        double d1 = obj1.getWidth();
        System.out.println(obj1.getWidth());
        double h1 = obj1.getHeight();
        System.out.println(h1);
        obj1.setWidth(2);
        obj1.setHeight(1.5);
        obj1.getArea();*/


        Wall wall=new Wall(5,4);
        System.out.println("area= "+wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("Width= "+wall.getWidth());
        System.out.println("Height= "+wall.getHeight());
        System.out.println("Area= "+wall.getArea());
    }

    //Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.
    public double width;
    public double height;

    // The first constructor does not have any parameters (no-arg  constructor)
    public Wall() {

    }
    // The second constructor has parameters width and height of type double and it needs to
    //nitialize the fields. In case the width is less than 0 it needs to set the width field value to 0,
    //in case the  height parameter is less than 0 it needs to set the height field value to 0.

    public Wall(double width, double height) {
        this.height = height;
        this.width = width;
        if (height < 0) {
            this.height = 0;
        }
        if (width < 0) {
            this.width = 0;
        }
        System.out.println("height: " + this.height + "  width:   " + this.width);
    }

    // Method named getWidth without any parameters, it needs to return the value of width field.
    public double getWidth() {
        //double d = this.width;
        return width;
    }

    // Method named getHeight without any parameters, it needs to return the value of height field.
    public double getHeight() {
        //double h = this.height;
        return height;
    }

    //Method named setWidth with one parameter of type double, it needs to set the value of the width field.
    // If the parameter is less than 0 it needs to set the width field value to 0
    public void  setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        }
        else {
            this.width=width;
        }

    }

    //Method named setWidth with one parameter of type double, it needs to set the value of the width field.
// If the parameter is less than 0 it needs to set the width field value to 0.
    public void setHeight(double height) {
        if (height < 0) {
           this. height = 0;
        }else {
            this.height = height;
        }
    }

    // Method named getArea without any parameters, it needs to return the area of the
    public double getArea() {
        double area = (height * width);
       // System.out.println("Area of wall=" + area);
        return area;

    }
}