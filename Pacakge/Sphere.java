
package vinu.don;


public class Sphere extends Shape {
    Sphere(int d1){
        super(d1, 0);
    }
    public double surfaceArea(){
        return 4 * Math.PI * this.d1 * this.d1;
    }
    public double volume(){
        return 4/3 * Math.PI * this.d1 * this.d1 * this.d1 ;
    }
}
