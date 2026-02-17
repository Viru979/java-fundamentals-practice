package vinu.don;

public class Rectangle extends Shape {
    Rectangle(int d1, int d2){
        super(d1, d2);
    }
    public int area(){
        return this.d1 * this.d2;
    }
}
