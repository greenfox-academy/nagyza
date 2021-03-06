import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by nagyza on 2017.03.29..
 */
public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 2 parameters:
    // the square size, and the fill color,
    // and draws a square of that size and color to the center of the canvas.
    // create a loop that fills the canvas with rainbow colored squares.

    Color[] color = {Color.MAGENTA, Color.BLUE, Color.CYAN, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};
    for (int i = 0; i < 150; i++) {
      int c = (i + 7) % 7;
      rainbowBox(graphics, i * 2, color[c]);
    }
  }

  public static void rainbowBox(Graphics g, int size, Color color) {
    g.setColor(color);
    g.drawRect(150 - size / 2, 150 - size / 2, size, size);
  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}
