import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * @author Aravind Thillai Villalan
 * @since 02-20-2020
 */

public class Circle extends Shapes {
    int RADIUS = 50;
    int DIAMETER = RADIUS * 2;
    Dot dot;

    public Circle(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate - RADIUS;
        this.yCoordinate = yCoordinate - RADIUS;
    }

    public void createShape(Graphics graphics) {
        Color green = new Color(0, 255, 72, 151);
        graphics.setColor(green);
        graphics.fillOval(this.xCoordinate, this.yCoordinate, this.DIAMETER, this.DIAMETER);
        dot = new Dot(RADIUS + this.xCoordinate, RADIUS + this.yCoordinate, graphics);
    }

    public boolean isInside(int x, int y) {
        return ( (x - (this.xCoordinate + RADIUS)) * (x - (this.xCoordinate + RADIUS)) +
                 (y - (this.yCoordinate + RADIUS)) * (y - (this.yCoordinate + RADIUS))
                <= this.RADIUS * this.RADIUS);
    }

    public boolean isDotClicked(MouseEvent mouseEvent){
        return dot.isInside(mouseEvent.getX(),mouseEvent.getY());
    }

    @Override
    public void changeLocation(int x, int y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }
}