package vinu.don;


public class Square extends Shape{
    Square(int d1){
        super(d1, 0);
    }
    public double area(){
        return Math.PI * this.d1 * this.d1;
    }
}
