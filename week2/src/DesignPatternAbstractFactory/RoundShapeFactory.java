package DesignPatternAbstractFactory;

public class RoundShapeFactory extends AbstractFactory {
    public Shape getShape(String ShapeType) {
        if (ShapeType.equalsIgnoreCase("RoundRectangle")) {
            return new RoundRectangle();
        } else if (ShapeType.equalsIgnoreCase("RoundSquare")) {
            return new RoundSquare();
        }
        return null;
    }
}
