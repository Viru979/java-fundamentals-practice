import java.util.Scanner;
// I used constructor overloading with constructor chaining to ensure that all constructors initialize the object properly

// Constructor chaining is used to reuse initialization logic.
// One constructor acts as the main initializer, and other constructors delegate to it using this()
class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        this(4, 5); // it is good approach.  // constructor chaining
    }
    public Rectangle(int length){
        this(length, 14);  // constructor chaining
    }
    public Rectangle(int length, int breadth){
        //this(length, breadth); --> // ❌ infinite loop chalega(💥StackOverflowError💥) aur Constructor khud ko hi call karta rahega
        this.length = length; // TARGET(Main / base) constructor
        this.breadth = breadth; // Main constructor (actual initialization)
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}
public class OopsObjectClassPractice {
    public static void main(String [] args){
        Rectangle rc = new Rectangle();
        System.out.println("The length of the rectangle is: " + rc.getLength());
        System.out.println("The breadth of the rectangle is: " + rc.getBreadth());

        Rectangle obj = new Rectangle(9);
        System.out.println("The length of the rectangle is: " + obj.getLength());
        System.out.println("The breadth of the rectangle is: " + obj.getBreadth());

        Rectangle obj2 = new Rectangle(9, 12);
        System.out.println("The length of the rectangle is: " + obj2.getLength());
        System.out.println("The breadth of the rectangle is: " + obj2.getBreadth());
    }
}





/*class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        length = 4; // bad approach if main constructor is present.
        breadth = 5; // bad approach if main constructor is present.
    }
    public Rectangle(int length){
        this.length = length;
        this.breadth = 14; // if not set it then it gives 0 (default value) when its called.
    }
        // main constructor
    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    
}
public class OopsObjectClassPractice {
    public static void main(String [] args){
        Rectangle rc = new Rectangle();
        System.out.println("The length of the rectangle is: " + rc.getLength());
        System.out.println("The breadth of the rectangle is: " + rc.getBreadth());

        Rectangle obj = new Rectangle(9);
        System.out.println("The length of the rectangle is: " + obj.getLength());
        System.out.println("The breadth of the rectangle is: " + obj.getBreadth());

        Rectangle obj2 = new Rectangle(9, 12);
        System.out.println("The length of the rectangle is: " + obj2.getLength());
        System.out.println("The breadth of the rectangle is: " + obj2.getBreadth());

    }
}*/





/*class Cylinder{
    private int radius;
    private int height;

    // public Cylinder(int radius, int height){ //we can use constructor instead of getters and setters
    //     this.radius = radius;
    //     this.height = height;
    // }

    public void setRadius(int radius){
        this.radius = radius; // if we not use this keyword then radius will be 0.
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    public float surfaceArea(){
        float area = (2* 3.142f * radius * radius) + (2 * 3.142f * radius * height);
        return area;
    }
    public float volume(){ // math.PI is a double type.
        double vlm = Math.PI * radius * radius * height;
        return (float)vlm; // explicitly conversion
    }
}
public class OopsObjectClassPractice {
    public static void main(String [] args){
        // Cylinder rds = new Cylinder(10, 15);

        Cylinder rds = new Cylinder();
        rds.setRadius( 9);
        rds.setHeight(12);

        System.out.println("The radius of the cylinder is: " + rds.getRadius());
        System.out.println("The height of the cylinder is: " + rds.getHeight());

        System.out.println("The suface Area of the cylinder is: " + rds.surfaceArea());
        System.out.println("The Volume of the cylinder is: " + rds.volume());
    }
}
*/