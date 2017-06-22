package controller;

import entities.Player;
import model.IModel;
import view.IView;
import view.Window;

/**
 * Controller
 * 
 * @author Loick Legay
 * @since 2017-06-20
 * 
 */
public class Controller {
	private int level;
	private char[][] map;
	private char[][] newMap;
	private boolean gameRunning;
	private Window window;

	/** The view. */
	private final IView view;

	/** The model. */
	private final IModel model;

	public Controller(int level, char[][] tabMap) {
		this.view = null;
		this.model = null;
		gameRunning = true;
		this.level = level;
		this.window= new Window();
		
		this.inGameLoop(tabMap);
	}


	/**
	 * Controller
	 * 
	 * @author Amaury VINCENT
	 * @param tabMap 
	 * @since 2017-06-20
	 * 
	 */
	public void inGameLoop(char[][] tabMap) {
		// RockfordDeplacementAcknoledgement
		while (gameRunning) {

			int keypressed;
			keypressed = Player.getkeypressed(1);
			this.newMap = Player.move(keypressed,tabMap);
			this.map = this.newMap;
			this.window.UpdateMap(this.map);
			
						try {
			    Thread.sleep(1000);                 //1000 milliseconds is one second.
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
		}
		// Monster Deplacement
		
		// Gravity

	}

	// getter
	public int getLevel() {
		return level;
	}

	// setter
	public void setLevel(int level) {
		this.level = level;
	}

	public char getTableauValue(int CaseX,int CaseY) {
		return this.map[CaseX][CaseY];
	}

	public void setTableauValue(int CaseX, int CaseY, char Value) {
		this.map[CaseX][CaseY] = Value;
	}


	public boolean isGameRunning() {
		return gameRunning;
	}


	public void setGameRunning(boolean gameRunning) {
		this.gameRunning = gameRunning;
	}
}
