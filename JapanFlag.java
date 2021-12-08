import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JapanFlag extends JPanel implements Drawable{
	//this is the Japan flag with the right parameters that is given 
	@Override
	public void draw(int x, int y, int width, int height, Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(x + width/2 - height/4,y + height/4, height/2, height/2);
		g.setColor(Color.BLACK);
		g.drawRect(x, y, width, height);

	}

}
