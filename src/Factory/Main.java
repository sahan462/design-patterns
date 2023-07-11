package Factory;

public class Main {

    public static void main(String args[]){
        ShapeFactory shape = new ShapeFactory();
        shape.getShape("Circle");
        shape.getShape("RectangLE");
        shape.getShape("TrIangle");
    }
}
