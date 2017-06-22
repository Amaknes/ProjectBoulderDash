package view;

import javax.swing.JFrame;


/**
 * 
 *
 * Spawns the frame and the panel and uses them in a single Class
 * @author      Amaury Vincent
 * @since       2017-06-16
 * 
 */
public class Window 
{
	Frame WindowFrame;
	Panel WindowPanel;
	
	
	public Window() 
	{
		this.WindowFrame = new Frame();
		this.WindowPanel = new Panel();
		WindowFrame.setTitle("BoulderDash");
		WindowFrame.setSize(400,400);
		WindowFrame.setLocationRelativeTo(null);
		WindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		WindowFrame.setContentPane(WindowPanel);
		
		WindowFrame.setVisible(true);
	}
	/**
	 * Displays the actual state of the Game
     * @author      Amaury Vincent
	 * @param Table : Table that contains the actual state of the game
	 */
	void Display(char[][] Table)
	{
		
	}
	
	public void UpdateMap(char[][] map){
		
		WindowFrame.setContentPane(WindowPanel);
	}
}

