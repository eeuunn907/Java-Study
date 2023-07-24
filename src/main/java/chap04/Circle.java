package chap04;

public class Circle {
    public static void main(String[] args){
        CircleDemo myCircle = new CircleDemo(10.0);
        CircleDemo yourCircle = new CircleDemo();
    }
}

class CircleDemo {
    private double radius;

    public CircleDemo(){}
    public CircleDemo(double r){
      radius= r;
    }
}