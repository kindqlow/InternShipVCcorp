package DesignPatternAbstractFactory;

public class ShapeFactory extends AbstractFactory {
    public Shape getShape(String ShapeType) {
        if (ShapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (ShapeType.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }
}
