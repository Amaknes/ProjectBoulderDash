package view;
/**
 * 
 *
 * Spawns the frame and the panel and uses them in a single Class
 * @author      Amaury Vincent
 * @since       2017-06-16
 */
public class Window 
{
	Frame WindowFrame;
	Panel WindowPanel;

	Window() 
	{
		this.WindowFrame = new Frame();
		this.WindowPanel = new Panel();
	}
}
