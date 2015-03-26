
import java.awt.*;

public class FractalTreePanel
{
    private final double lengthChange = 0.5;
    private int currentAngle = 90;
    
    public void drawFractal (Graphics g, int x1, int y1, int angle, int length)
    {
        int x2, y2, newLength;
        if (length > 1)
        {
            int newAngle = currentAngle - angle;
            x2 = getNewX(x1,newAngle,length);
            y2 = getNewY(y1,newAngle,length);
            newLength = (int) (length*lengthChange);
            g.drawLine(x1,y1,x2,y2);
            drawFractal(g,x2,y2,newAngle,newLength);
        }
    }
    
    public int getNewX(int x, int angle, int length)
    {
        int newX;
        newX = x + (int) (length*Math.cos(angle));
        return newX;
    }
    
    public int getNewY(int y, int angle, int length)
    {
        int newY;
        newY = y + (int) (length*Math.sin(angle));
        return newY;
    }
}