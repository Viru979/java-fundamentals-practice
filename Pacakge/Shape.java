package vinu.don;


public class Shape{
    int d1;
    int d2;
    Shape(int d1, int d2){
        this.d1 = d1;
        this.d2 = d2;
    }
    public int getDim1(){
        return this.d1;
    }
    public int getDim2(){
        return this.d2;
    }
    public void setDim1(int d1){
        this.d1 = d1;
        return;
    }
    public void setDim2(int d2){
        this.d2 = d2;
        return;
    }
}