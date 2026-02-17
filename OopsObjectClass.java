import java.util.Scanner;


/*class Employee{
    private int salary;
    private String name;

    public int getSalary(){
        return salary;
    }
    public void setSalary(){
        salary = 500000;
        return;
    }
    public void setSalary(int salary){
        this.salary = salary;
        return;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        name ="Virendra Maurya";
        return;
    }
    public void setName(String nm){
        name = nm;
        return;
    }
}
public class OopsObjectClass {
    public static void main(String [] args){
        Employee obj = new Employee();
        // obj.salary = 90000; // we cant directly accesse to the private variable.
        // obj.name = "Viru Bhai"; // we cant directly accesse to the private variable.
        obj.setSalary();
        System.out.println("the salary of the employee is: "+ obj.getSalary());

        obj.setSalary(1200000);
        System.out.println("the salary of the employee is: "+ obj.getSalary());

        obj.setName();
        System.out.println("The name of the employee is: "+obj.getName());

        obj.setName("Viru Bhai");
        System.out.println("The name of the employee is: "+obj.getName());
    }
}*/



/*class Square{
    int side;
    public float calculateArea(){
        float area = side * side;
        return area;
    }
    public int calculatePerimeter(){
        return side * 4;
    }
}

class Rectangle{
    int width;
    int height;
    public int calculateArea(){
        int area = width * height;
        return area;
    }
    public void calculatePerimeter(){
        int pr = 2*(width + height);
        System.out.println("The perimeter of the Reactangle is: "+ pr);
        return;
    }
}

class CircleOperations{
    int radius;

    public float calculateArea(){
        float ar = 3.14f * radius * radius;
        return ar;
    }
    public float calculatePerimeter(){
        float pm = 2* 3.14f * radius;
        return pm;
    }
}
public class OopsObjectClass {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        CircleOperations cr = new CircleOperations();
        System.out.print("Enter the radius of circle: ");
        cr.radius = sc.nextInt();
        
        float area = cr.calculateArea();
        System.out.println("The area of the circle is: "+ area);
        
        float per = cr.calculatePerimeter();
        System.out.println("The perimeter of the circle is: "+ per);


        Rectangle rc = new Rectangle();
        rc.width = 5;
        rc.height = 7;
        System.out.println("The area of the Rectangle is: "+ rc.calculateArea());
        rc.calculatePerimeter();


        Square obj = new Square();
        obj.side = 5;
        float ar = obj.calculateArea();
        System.out.println("The area of square is: "+ ar);
        System.out.println("The perimeter of the square is: "+ obj.calculatePerimeter());
    }
}*/



/*class TommyVercetti{
    public void hiting(){
        System.out.println("Tommy hittinging the enemy.");
    }
    public void running(){
        System.out.println("tommy runs toward enemy.");
    }
    public void firing(){
        System.out.println("The fire on enemy.");
    }
}
public class OopsObjectClass {
    public static void main(String [] args){
        TommyVercetti player = new TommyVercetti();
        player.hiting();
        player.running();
        player.firing();
    }
}*/




/*class CellPhone{
    public void phoneRinging(){
        System.out.println("The phone is Ringing...");
        return;
    }
    public void vibratePhone(){
        System.out.println("The phone is Vibrating...");
        return;
    }
}
public class OopsObjectClass {
    public static void main(String [] args){
        CellPhone realme = new CellPhone();
        realme.phoneRinging();
        realme.vibratePhone();

    }
}
*/




/*class Employee{
    int id;
    String name;
    int age;
    int salary;
    public void  printDetails(){
        
        System.out.println("The name of the employee is: "+ name);
        System.out.println("The id of the employee is: "+ id);
        System.out.println("The age of the employee is: "+ age);
        return;
    }
    public int getSalary(){ // Static method instance variable ko direct access nahi kar sakta
        return salary;
    }
}
public class OopsObjectClass {
    public static void main(String[] args){
        Employee viru = new Employee();
        Employee virendra = new Employee();

        viru.salary = 50000;
        virendra.salary = 60000;

        System.out.println("The salary of Viru is: "+ viru.getSalary());
        System.out.print("The salary of Virendra is: "+ virendra.getSalary());
    }
}*/


/*class Employee{
    int id;
    String name;
    int age;
    public void  printDetails(){ // static method can't access  of data object (id, name, age). so we remove static here.
        
        System.out.println("The name of the employee is: "+ name);
        System.out.println("The id of the employee is: "+ id);
        System.out.println("The age of the employee is: "+ age);
        return;
    }
    public static int getSalary(int salary){ // not good approach to pass the parameter. but we use because the method is static.
        return salary;
    }
}
public class OopsObjectClass {
    public static void main(String[] args){
        Employee viru = new Employee();
        viru.id = 101;
        viru.name = "Viru Don";
        viru.age = 22;
        viru.printDetails();

        Employee virendra = new Employee();
        virendra.id = 201;
        virendra.name = "Virendra Maurya";
        virendra.age = 22;
        virendra.printDetails();

        int salary = Employee.getSalary(50000); // argument is given at the calling time is not correct method
        System.out.print("The salary of the employee is: "+ salary);
    }
}*/



/*class Employee{
    int id; // instance variable
    String name;
    static int age;
    public void  printDetails(){ // static method can't access  of data object (id, name, age). so we remove static here.
        
        System.out.println("The name of the employee is: "+ name);
        System.out.println("The id of the employee is: "+ id);
        System.out.println("The age of the employee is: "+ age);
        return;
    }
}
public class OopsObjectClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee obj = new Employee(); // it correct because printdetails not a static method
        System.out.print("Enter id: ");
        obj.id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter age: ");
        // obj.age = sc.nextInt();  //  ❌ allowed hai, but bad practice.
        Employee.age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        obj.name = sc.nextLine();
        obj.printDetails();
    }
}
*/

/*class Employee{
    public static void  printDetails(){
        int id =101; // local variable
        String name = "Virendra";
        int age = 22;
        System.out.println("The name of the employee is: "+ name);
        System.out.println("The id of the employee is: "+ id);
        System.out.println("The age of the employee is: "+ age);
        return;
    }
}

public class OopsObjectClass {
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);
        Employee obj = new Employee(); // This is wrong because static method no need to creat an object.
       // obj.printDetails();// ❌
       //  Employee.id = 200; // ❌ local variable Method ke bahar access nahi hota h.
       // Local variables cannot be accessed or modified using class name or object reference.
        Employee.printDetails();
    }
}


/*class Employee{
        String name = "Viru"; // instance variable
        int id = 100;
        int age = 21;

    }
public class OopsObjectClass {
    // understand how classes are create object and then call with user input and change the default values;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee obj = new Employee();
        obj.name = sc.nextLine();
        obj.id = sc.nextInt();
        obj.age = sc.nextInt();

        System.out.println("The name of employee is: " +obj.name);
        System.out.println("The id of employee is: " + obj.id);
        System.out.println("The age of employee is: " + obj.age);
    }
}*/



/*class Employee{
        String name = "Viru"; // attributes (Instance variable)
        int id = 100; // attributes
        int age = 21; // attributes

    }
// understand how classes are create object and then call
public class OopsObjectClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee obj = new Employee();
        String name = obj.name;
        int id = obj.id;
        int age = obj.age;

        System.out.println("The name of employee is: " +name);
        System.out.println("The id of employee is: " + id);
        System.out.println("The age of employee is: " + age);
    }
}
*/