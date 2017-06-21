package controller;

import javax.swing.text.View;

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
	private boolean gameRunning;
	private Window window;

	/** The view. */
	private final IView view;

	/** The model. */
	private final IModel model;

	public Controller(int level) {
		this.view = null;
		this.model = null;
		this.initMap(level);
		gameRunning = true;
		this.level = level;
		this.window= new Window();
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
	 * @since 2017-06-20
	 * 
	 */
	public void inGameLoop() {
		// RockfordDeplacementAcknoledgement

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
