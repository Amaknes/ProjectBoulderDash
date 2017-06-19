import javax.swing.text.View;

public class Controller {
	private int level;
	private char[] map;

	/** The view. */
	private final IView view;

	/** The model. */
	private final IModel model;

	/**
	 * 
	 * @author Loick Legay
	 * @since 2017-06-19
	 * 
	 *
	 */

	public Controller(int level) {
	}

	public void start(int level) {

	}

	public char initMap(int level) {

		return 0;
	}

	public void inGame() {

	}

	// getter
	public int getLevel() {
		return level;
	}

	// setter
	public void setLevel(int level) {
		this.level = level;
	}
}
