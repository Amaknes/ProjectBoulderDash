package controller;

import javax.swing.text.View;

import model.IModel;
import view.IView;

public class Controller {
	private int level;
	private char[] map;

	/** The view. */
	private final IView view;

	/** The model. */
	private final IModel model;
		
		

	public Controller (int level) {
		this.view=null;
		this.model=null;
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
