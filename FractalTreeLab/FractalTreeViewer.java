

import javax.swing.*;
import java.awt.*;

public class FractalTreeViewer
{
    private FractalTreePanel fractalTree;
    private JFrame frame;
    private JPanel panel;
    private Graphics g;
    
    public void FractalTreeViewer()
    {
        g = new Graphics();
        frame = new JFrame();
        frame.setSize(1000,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fractalTree = new FractalTreePanel();
        panel.add(fractalTree);
        frame.add(panel);
        frame.setVisible(true);
        
    }
    
    public static void main(String[] args)
    {
        FractalTreeViewer viewer = new FractalTreeViewer();
    }
}