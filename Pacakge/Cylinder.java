package vinu.don;


public class Cylinder extends Shape{
    Cylinder(int d1, int d2){
        super(d1, d2);
    }
    public double surfaceArea(){
        return (2 * Math.PI * this.d1 * this.d2) + (2 * Math.PI * this.d1 * this.d1);
    }
    public double volume(){
        return Math.PI * this.d1 * this.d1 * this.d2 ;
    }
}