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
		this.initMap(level);
		gameRunning = true;
		this.level = level;
		this.window= new Window();
		this.inGameLoop(tabMap);
	}

	public void start() {

	}

	public char initMap(int level) {

		return 0;
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

			this.newMap = Player.move(1,tabMap);
			this.map = this.newMap;
			for(int i = 0; i < 25; i++) {
	            for(int j =0; j < 25; j++) {
	            	System.out.print(this.map[i][j]);		
	            }
	            System.out.println("");
	        }
	        System.out.println("");
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
}
