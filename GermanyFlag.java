import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GermanyFlag extends JPanel implements Drawable  {
	//this is the Germany flag with the right parameters that is given 
	@Override
	public void draw(int x, int y, int width, int height, Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(x,y, width, height/3);
		g.setColor(Color.RED);
		g.fillRect(x,y + (height/3), width, height/3);
	    g.setColor(Color.YELLOW);
		g.fillRect(x,y + (height/3)*2, width, height/3);	
		g.setColor(Color.BLACK);
		g.drawRect(x, y, width, height);
		

	}

}
