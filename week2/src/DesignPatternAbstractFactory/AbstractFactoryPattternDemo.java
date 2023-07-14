package DesignPatternAbstractFactory;

public class AbstractFactoryPattternDemo {
    public static void main(String[] args) {
        //  get ShapeFactory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        // get an object of Shape Rectangle
        Shape shape1 = shapeFactory.getShape("Rectangle");
        shape1.draw();
        // get an object of Shape Square
        Shape shape2 = shapeFactory.getShape("Square");
        shape2.draw();

        // get RoundShapeFactory
        AbstractFactory roundshapeFactory = FactoryProducer.getFactory(true);
        // get an object of Shape RoundRectangle
        Shape shape3 = roundshapeFactory.getShape("RoundRectangle");
        shape3.draw();
        // get an object of Shape RoundSquare
        Shape shape4 = roundshapeFactory.getShape("RoundSquare");
        shape4.draw();
    }
}
