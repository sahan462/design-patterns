package Factory;

public class ShapeFactory {

    public Shape getShape(String name) {

        if (name.equalsIgnoreCase("Circle")) {
            Shape ob = new circle();
            return ob;
        } else if (name.equalsIgnoreCase("Rectangle")) {
            Shape ob = new rectangle();
            return ob;
        } else {
            Shape ob = new rectangle();
            return ob;
        }
    }
}
