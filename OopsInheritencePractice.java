// No default constructor in parent → super(args) is mandatory.

class Base{
    int x;
    // public Base(){
    //     System.out.println("I am a base class constructor.");
    // }
    public Base(int x){
        System.out.println("I am an overloaded base class constructor with value of x as: " + x);
    }
}
class Derieved extends Base{
    public Derieved(){ // we can't use super(x) because it has no any local variable but
        super(0);  // we only can pass arguments, not parameter
        // Agar parent class me default constructor nahi hai, to child constructor me super(args) likhna COMPULSORY hai.
        // qki by default ye super() ko call karta h.
        System.out.println("I am a Derived class constructor.");
    }
    public Derieved(int x, int y){
        super(x);
        System.out.println("I am an overloaded Derieved class constructor with value of y as: " + y);
    }
}

public class OopsInheritencePractice {
    public static void main(String[] args){
        Derieved d = new Derieved();
        Derieved dr = new Derieved(40, 30);
    }
}



/*class Base{
    public Base(){
        System.out.println("I am a base class constructor.");
    }
    public Base(int x){
        System.out.println("I am an overloaded base class constructor with value of x as: " + x);
    }
}
class Derieved extends Base{
    public Derieved(){
        // super(); // default parent constructor     If you don't write super(), Java automatically inserts it.
        System.out.println("I am a Derived class constructor.");
    }
    public Derieved(int x, int y){
        super(x); // If you don't write super(), Java automatically inserts it. and then call the without parametrized base constructor.
        System.out.println("I am an overloaded Derieved class constructor with value of y as: " + y);
    }
}
class ChildOfDerieved extends Derieved{
    public ChildOfDerieved(){
        System.out.println("I am a Child of Derived class constructor.");
    }
    public ChildOfDerieved(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded ChildeOfDerieved class constructor with value of z as: " + z);
    }
}
public class OopsInheritencePractice {
    public static void main(String[] args){
        // Derieved d = new Derieved();
        //Derieved dr = new Derieved(40, 30);
        ChildOfDerieved cdr = new ChildOfDerieved();
        ChildOfDerieved cdr1 = new ChildOfDerieved(40, 30, 70);
    }
}*/





/*class Base{
    public Base(){
        System.out.println("I am a base class constructor.");
    }
    public Base(int x){
        System.out.println("I am an overloaded base class constructor with value of x as: " + x);
    }
}
class Derieved extends Base{
    public Derieved(){
        System.out.println("I am a Derived class constructor.");
    }
}
public class OopsInheritencePractice {
    public static void main(String[] args){
        // Base bs = new Base();
        // Base p = new Base(97);
        Derieved d = new Derieved();
    }
}*/



/*class Base{
    int x;
    public void setX(int x){
        System.out.println("I am in the Base Class and setting x now.");
        this.x = x;
    }
    public int getX(){
        return x;
    }
    public void printMe(){
        System.out.println("I am a public method.");
    }
}
class Derieved extends Base{
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
}
public class OopsInheritencePractice {
    public static void main(String[] args){
        // creating an object of base (parent) class.
        Base bs = new Base();
        bs.setX(6);
        //bs.setY(6); // Can't access
        System.out.println("The value of x is: " + bs.getX() + "\n");
        
        // creating an object of Derived class (subclass).
        Derieved d = new Derieved();
        d.setX(12);
        d.setY(42);
        System.out.println("The value of x is: " + d.getX());
        System.out.println("The value of y is: " + d.getY());
    }
}*/
