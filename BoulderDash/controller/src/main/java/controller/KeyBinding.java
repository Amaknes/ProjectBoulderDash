package controller;
/**
 * 
 *
 * Key event
 * @author      Loick Legay
 * @since       2017-06-19
 * 
 */
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import entities.Player;

public class KeyBinding implements KeyListener {
	private int id;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public void keyPressed(KeyEvent k) {
		// TODO Auto-generated method stub
		int key = k.getKeyCode();
		switch (key) {
			case KeyEvent.VK_DOWN : 
				//Player.move(1);
				break;
			case KeyEvent.VK_UP:
				//Player.move(2);
				break;
			case KeyEvent.VK_RIGHT:
				//Player.move(3);
				break;
			case KeyEvent.VK_LEFT:
				Player.move(4);
				break;
		}
	}
	@Override
	public void keyReleased(KeyEvent k) {
		//Player.move(0);
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent k) {
		// TODO Auto-generated method stub
		
	}
	
	
}
