package FactoryPattern;

public class ShapeFactory {
    public Shape getShape(String Input) {

        return switch (Input) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            default -> null;
        };
    }
}
