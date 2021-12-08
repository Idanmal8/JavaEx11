import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class FlagsPanel extends JPanel {
	private Drawable[][] flags;

/***
 * this is a method that give a random number and giving an 2d array with a grid of flags 
 * @param random number and an array
 * @return the grid of the flags
 * **/

	public FlagsPanel(int rows , int cols) {
		flags = new Drawable[rows][cols];
		if(rows == 0 || cols == 0) {
			return;
		}
		for(int i = 0 ; i < flags.length ; i++) {
			for(int j = 0 ; j < flags[i].length ; j++ ) {
				int randomNum = (int)(Math.random() * 3);
				if(randomNum == 0) {
					this.flags[i][j] = new FranceFlag();
				}else if(randomNum == 1) {
					this.flags[i][j] = new GermanyFlag();
				}
				else {
					this.flags[i][j] = new JapanFlag();
				}
			}
		}
	}
	/***
	 * this method is painting the flags into the array by calculating the width and height at the right size 
	 * @return the painted grid 
	 * **/
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		int colsSum = flags[0].length;
		int rowSum = flags.length;
		if(flags.length == 0 || flags[0].length == 0) {
			return;
		}
		for(int i = 0; i < flags.length ; i++) {
			for(int j = 0 ; j < flags[i].length ; j++) {
				this.flags[i][j].draw(j*(getWidth()/colsSum),i*(getHeight()/rowSum), getWidth()/colsSum, getHeight()/rowSum, g);
			}
			
		}
		
	}
}




