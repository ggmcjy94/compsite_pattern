package exam02;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        drawing.add(new Circle());
        drawing.add(new Triangle());

        drawing.draw("Red");
        List<Shape> shapes = new ArrayList<>();
        shapes.add(drawing);
        shapes.add(new Triangle());
        shapes.add(new Circle());

        for (Shape shape : shapes) {
            shape.draw("Green");
        }

    }
}
