package controller;

import javax.swing.text.View;


import model.IModel;
import view.IView;
/**
 * Controller
 * @author      Loick Legay 
 * @since       2017-06-20
 * 
 */
public class Controller {
	private int level;
	private char[] map;
	private boolean gameRunning;
	
	/** The view. */
	private final IView view;

	/** The model. */
	private final IModel model;
		
		

	public Controller (int level) {
		this.view=null;
		this.model=null;
		this.initMap(level);
		gameRunning = true;
		this.level = level;
	}


	public void start() {
		
		
		
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
