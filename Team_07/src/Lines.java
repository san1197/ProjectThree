import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.Serializable;

/**
 * @author Aravind Thillai Villalan
 * @since 02-20-2020
 */

public class Lines extends Shapes implements Serializable {

    private int srcPointX, srcPointY;
    private int destPointX, destPointY;

    public Lines(int srcPointX, int srcPointY, int destPointX, int destPointY) {
        super();
        this.srcPointX = srcPointX;
        this.srcPointY = srcPointY;
        this.destPointX = destPointX;
        this.destPointY = destPointY;
    }

    @Override
    public void createShape(Graphics graphics) {
        graphics.drawLine(this.srcPointX, this.srcPointY, destPointX, destPointY);
    }

    @Override
    public boolean isInside(int x, int y) {
        return false;
    }

    @Override
    public void changeLocation(int x, int y) {
        this.srcPointX = x;
        this.srcPointY = y;
    }

    @Override
    public boolean isDotOrBarClicked(MouseEvent mouseEvent) {
        return false;
    }

    public void changeSourceLocation(int x, int y) {
        this.srcPointX = x;
        this.srcPointY = y;
    }

    public void changeDestinationLocation(int x, int y) {
        this.destPointX = x;
        this.destPointY = y;
    }

    public Point getCoordinatesOne() {
        return new Point(srcPointX, srcPointY);
    }

    public Point getCoordinatesTwo() {
        return new Point(destPointX, destPointY);
    }

}
