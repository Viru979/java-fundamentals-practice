import java.util.Scanner;


interface TvRemote{
    void power();  // abstract public <- by default
    void changeChannel(int channel); // abstract public
}
interface SmartTvRemote extends TvRemote{
    void openYoutube(); // abstract public
    void openNetflix(); // abstract public
}
class Tv implements TvRemote{
    @Override
    public void power(){
        System.out.println("Power button ON.");
    }
    @Override
    public void changeChannel(int channel){
        System.out.println("Channel change to " + channel);
    }
}
public class OopsAbstractionPracticeInterface {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // polymorphism using TvRemote
        TvRemote remote = new Tv();
        remote.power();
        System.out.print("Enter channel number: ");
        int num = sc.nextInt();
        if(num>=0 && num <=200){
            remote.changeChannel(num);
        }
        else{
            System.out.println("Channel in not available.");
        }
    }
}

/*abstract class Telephone{
    abstract void ring();
    public abstract void lift();
    abstract void disconnect();
}
class SmartPhone extends Telephone{
    @Override
    void ring(){
        System.out.println("Ringing...");
    }
    @Override
    public void lift(){
        System.out.println("Lifting...");
    }
    @Override
    public void disconnect(){
        System.out.println("Disconneting...");
    }
}
public class OopsAbstractionPracticeInterface {
    public static void main(String args[]){
        SmartPhone smph = new SmartPhone();
        // smph.ring();
        // smph.lift();
        // smph.disconnect();

        // demonstrating runtime polymorphism (parent reference → child object)
        Telephone ph = new SmartPhone();
        ph.ring();
        ph.lift();
        ph.disconnect();
    }
}



/*interface BasicAnimal{
    void eat(); // public abstract
    void sleep(); // public abstract
}
class Monkey{
    void jump(){
        System.out.println("Monkey can jump from one try to another.");
    }
    void bite(){
        System.out.println("Monkey can bite anyone");
    }
}
class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("Animal eating...");
    }
    @Override
    public void sleep(){
        System.out.println("Animal sleeping");
    }
}
public class OopsAbstractionPracticeInterface {
    public static void main(String args[]){
        Human hm = new Human();
        hm.eat();
        hm.sleep();
        hm.jump();
        hm.bite();

        // demonstrating polymorphism using Momkey()
        Monkey mk = new Human();
        mk.jump();
        mk.bite();
    }
}


/* // question 1 & 2
abstract class Pen{
    abstract void write();
    abstract public void refill();
}
class FoundationPen extends Pen{
    public void changeNib(){
        System.out.println("You can change your nib.");
    }
    @Override
    void write(){
        System.out.println("You can write in this copy with your pen.");
    }
    @Override
    public void refill(){
        System.out.println("Without refill per is useless.");
    }
}
public class OopsAbstractionPracticeInterface {
    public static void main(String args[]){
        //Pen pen = new FoundationPen();
        FoundationPen pen = new FoundationPen();
        pen.changeNib();
        pen.write();
        pen.refill();

    }
}









/* // All methods in an interface are public (abstract) by default.
// While implementing them, we cannot reduce their access level
// Class → Interface 👉 implements
// Interface → Interface 👉 extends
// Class → Class 👉 extends

// purpose of default to  provide a body in interface without breaking old classes.

// Class = how something is built
// Interface = what something can do     so interface don't have constructor.

// Interfaces provide 100% abstraction, support multiple inheritance,
// allow default and static methods, and help achieve loose coupling in Java.

//  Method access depends on reference type, not object type.
//  @Override helps the compiler detect accidental method signature mismatches.

interface MyCamera{
    void takeSnap();
    void recordVideo();
    // Private methods in interfaces help avoid code duplication in default methods.
    // if default method's logic is too long, then we use private method.
    private void greet(){ // esko(interface ko) use(access) karne wali class MySmartPhone bhi use nhi kar payegi.
        System.out.println("Good Morning..");
    }
    // purpose of default to  provide a body in interface without breaking old classes.
    default void record4KVideo(){
        greet(); // calling private helper method to avoid code duplication in default methods.
        System.out.println("Recording in 4k...");
    }
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
    static void connectBluetooth(){ // no need to implements also  cannot be overridden.
        System.out.println("Bluetooth connected successfully.");
    }
}
class MyCellPhone{
    void callNumber(long phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    void playMusic(){
        System.out.println("Playing my favorite music.");
    }
    // @Override   // record4KVideo() is not overridden here,
                   // so the interface default method executes and calls its private helper method
    // public void record4KVideo(){
    //     System.out.println("Recording in 8K Ultra HD...");
    // }
    public void takeSnap(){
        System.out.println("Taking snap.");
    }
    public void recordVideo(){
        System.out.println("Recording video.");
    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String networkList[] = { "Viru", "Bhai", "Virendra", "Maurya"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class OopsAbstractionPracticeInterface {
    public static void main(String args[]){
        MySmartPhone realme = new MySmartPhone();
        realme.takeSnap();
        realme.recordVideo();
        realme.record4KVideo();

        String arr[] = realme.getNetworks();
        for(String item : arr){
            System.out.println(item);
        }
        realme.connectToNetwork("Don");
        MyWifi.connectBluetooth();

        realme.callNumber(9792992861L);
        realme.pickCall();
        realme.playMusic();
    }
}






/*interface MyCamera{
    void takeSnap();
    void recordVideo();

    // purpose of default to  provide a body in interface without breaking old classes.
    default void record4KVideo(){ // no need to implements. but we can override it.
        System.out.println("Recording in 4k...");
    }
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
    static void connectBluetooth(){ // no need to implements also  cannot be overridden.
        System.out.println("Bluetooth connected successfully.");
    }
}
class MyCellPhone{
    void callNumber(long phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    void playMusic(){
        System.out.println("Playing my favorite music.");
    }
    @Override  // it helps catch errors at compile time
    // While overriding a default method from an interface, the method must remain public, because interface methods are public by default.
    public void record4KVideo(){ // default keyword sirf interface ke andar allowed hota hai, class ke andar kabhi nahi ❌
        System.out.println("Recording in 8K Ultra HD...");
    }
    @Override // it helps catch errors at compile time
    public void takeSnap(){
        System.out.println("Taking snap.");
    }
    @Override  // it helps catch errors at compile time
    public void recordVideo(){
        System.out.println("Recording video.");
    }
    @Override
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String networkList[] = { "Viru", "Bhai", "Virendra", "Maurya"};
        return networkList;
    }
    @Override
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class OopsAbstractionPracticeInterface {
    public static void main(String args[]){
        MySmartPhone realme = new MySmartPhone();
        realme.takeSnap();
        realme.recordVideo();
        realme.record4KVideo();

        String arr[] = realme.getNetworks();
        for(String item : arr){
            System.out.println(item);
        }
        realme.connectToNetwork("Don");
        MyWifi.connectBluetooth();

        realme.callNumber(9792992862L);
        realme.pickCall();
        realme.playMusic();
    }
}*/





/*interface MyCamera{
    void takeSnap();
    void recordVideo();
}
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(long phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{
    void playMusic(){
        System.out.println("Playing my favorite music.");
    }
    public void takeSnap(){
        System.out.println("Taking snap.");
    }
    public void recordVideo(){
        System.out.println("Recording video.");
    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String networkList[] = { "Viru", "Bhai", "Virendra", "Maurya"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class OopsAbstractionPracticeInterface {
    public static void main(String args[]){
        MySmartPhone realme = new MySmartPhone();
        realme.takeSnap();
        realme.recordVideo();

        String arr[] = realme.getNetworks();
        for(String item : arr){
            System.out.println(item);
        }
        realme.connectToNetwork("Don");

        realme.callNumber(9792992862L);
        realme.pickCall();
        realme.playMusic();
    }
}*/



// inheritence through interface.

/*interface Animal{
    int a = 97; // by default ---> public static final int a = 97;
    void sound(int increment);
    void play();
    static void askQuestion(){ // static method allowed h
        System.out.println("How are you?");
    }
}
interface Bird extends Animal{ // An interface can extends another interface.
    void eat(); // sound() and play() aslo included here through inheritence
    void fly();
}
class Dogs implements Bird{ // If a class implements an interface (or child interface), it must implement all inherited abstract methods
    void legs(){
        System.out.println("Animal has four legs and bird has two legs.");
    }
    public void sound(int increment){
        System.out.println("Dogs bark at stranger.");
    }
    public void play(){
        System.out.println("Dogs are playing.");
    }
    public void eat(){
        System.out.println("Dog eats bones.");
    }
    public void fly(){
        System.out.println("Birds can fly in the sky.");
    }
}
public class OopsAbstractionPracticeInterface {
    public static void main(String args[]){
        // Dogs obj = new Dogs();
        // obj.legs();
        // obj.sound(9);
        // obj.play();
        // obj.eat();
        // obj.fly();
        //  // obj.a = 10; // we can't modify interface's properties due to final.
        //  // System.out.println(obj.a); // not a good approach

        Animal obj1 = new Dogs(); // interface ka object nhi ban sakta lekin reference ban sakta h.
        obj1.sound(9);
        obj1.play();
        // // obj1.a = 10; // we can't modify interface's properties due to final.
        // //System.out.println(obj1.a); // not a good approach
        System.out.println(Animal.a); // good approach due to static
        Animal.askQuestion();

        Bird obj2 = new Dogs();
        obj2.eat();
        obj2.fly();
    }
}*/








/* // ✔️ Java me multiple inheritance of classes ❌
// ✔️ Multiple inheritance via interface ✅
interface Animal{
    int a = 97; // by default ---> public static final int a = 97;
    void sound(int increment); // by default --> public abstract void applyBreak(int decrement);
    void play();
    static void askQuestion(){ // static method allowed h
        System.out.println("How are you?");
    }
}
interface Bird{
    void eat();
    void fly();
}
class Dogs implements Animal, Bird{ // multiple inheritence using interface
    void legs(){
        System.out.println("Animal has four legs and bird has two legs.");
    }
    public void sound(int increment){
        System.out.println("Dogs bark at stranger.");
    }
    public void play(){
        System.out.println("Dogs are playing.");
    }
    public void eat(){
        System.out.println("Dog eats bones.");
    }
    public void fly(){
        System.out.println("Birds can fly in the sky.");
    }
}
public class OopsAbstractionPracticeInterface {
    public static void main(String args[]){
        // Dogs obj = new Dogs();
        // obj.legs();
        // obj.sound(9);
        // obj.play();
        // obj.eat();
        // obj.fly();
        //  // obj.a = 10; // we can't modify interface's properties due to final.
        //  // System.out.println(obj.a); // not a good approach

        Animal obj1 = new Dogs(); // interface ka object nhi ban sakta lekin reference ban sakta h.
        obj1.sound(9);
        obj1.play();
        // // obj1.a = 10; // we can't modify interface's properties due to final.
        // //System.out.println(obj1.a); // not a good approach
        System.out.println(Animal.a); // good approach due to static
        Animal.askQuestion();

        Bird obj2 = new Dogs();
        obj2.eat();
        obj2.fly();
    }
}*/





/*interface Animal{
    int a = 97; // by default ---> public static final int a = 97;
    void sound(int increment); // by default --> public abstract void applyBreak(int decrement);
    void play();
}
class Dogs implements Animal{
    void legs(){
        System.out.println("Animal has four legs and bird has two legs.");
    }
    public void sound(int increment){ //❌ Access level kam na ho esliye public must h. (default < public)
        System.out.println("Dogs bark at stranger.");
    }
    public void play(){ // ❌ Access level kam na ho esliye public must h. (default < public)
        System.out.println("Dogs are playing.");
    }
}
public class OopsAbstractionPracticeInterface {
    public static void main(String args[]){
        // Dogs obj = new Dogs();
        // obj.legs();
        Animal obj = new Dogs(); // interface ka object nhi ban sakta lekin reference ban sakta h.
        obj.sound(9);
        obj.play();
        // obj.a = 10; // we can't modify interface's properties due to final.
        System.out.println(obj.a);
    }
}*/







// private int x = 10;     // ❌ instance variable
// protected void test(); // ❌
// constructor();         // ❌