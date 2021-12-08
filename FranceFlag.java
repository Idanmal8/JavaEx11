
import javax.swing.*;
import java.awt.*;

public class FranceFlag extends JPanel implements Drawable {
//this is the France flag with the right parameters that is given 
	@Override
	public void draw(int x, int y, int width, int height, Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x,y, width/3, height);
		g.setColor(Color.WHITE);
		g.fillRect(x + (width/3),y, width/3, height);
	    g.setColor(Color.RED);
		g.fillRect(x + (width/3)*2,y, width/3, height);	
		g.setColor(Color.BLACK);
		g.drawRect(x, y, width, height);
		
		
		
	}
}


