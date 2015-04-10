

import javax.swing.*;
import java.awt.*;

public class RandomTreeViewer
{
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(1000,1000);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FractalRandomTree fractalTree = new FractalRandomTree();
        frame.add(fractalTree);
        
        frame.setVisible(true);
    }
}