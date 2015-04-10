
import java.awt.*;
import javax.swing.*;

public class FractalTreePanel extends JPanel
{
   
    private final double lengthChange = 0.8;
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        drawFractal(g,500,500,500,425,20,75,90,1);
    }
    
    public void drawFractal (Graphics g,int preX, int preY, int x, int y, int angle, int length, int currentAngle,
                             int colorType)
    {
        int newLength, newX1, newY1, newX2, newY2;
        Graphics2D g2 = (Graphics2D) g;
        g.drawLine(preX, preY, x, y);
        if (length > 1)
        {
            int newAngle1 = currentAngle - angle;
            if (newAngle1 < 0)
            {
                newAngle1 = 360 + newAngle1;
            }
            
            int newAngle2 = currentAngle + angle;
            if (newAngle2 > 360)
            {
                newAngle2 = newAngle2 - 360;
            }
            
            newLength = (int) (length*lengthChange);
            
            newX1 = getNewX(x,newAngle1,newLength);
            newX2 = getNewX(x,newAngle2,newLength);
            
            newY1 = getNewY(y,newAngle1,newLength);
            newY2 = getNewY(y,newAngle2,newLength);
            if (colorType == 1)
            {
                g2.setColor(Color.GREEN);
                colorType = 2;
            }
            else if (colorType == 2)
            {
                g2.setColor(Color.BLUE);
                colorType = 1;
            }
            
            drawFractal(g, x, y, newX1, newY1, angle, newLength, newAngle1, colorType);
            drawFractal(g, x, y, newX2, newY2, angle, newLength, newAngle2, colorType);
        }
        
    }
    
    public int getNewX(int x, int angle, int length)
    {
        int newX;
        newX = x + (int)(Math.cos(Math.toRadians(angle))*length);
        return newX;
    }
    
    public int getNewY(int y, int angle, int length)
    {
        int newY;
        newY = y - (int)(Math.sin(Math.toRadians(angle))*length);
        return newY;
    }
    
    public void drawLine(Graphics g, int preX, int preY, int x, int y)
    {
        
    }
}