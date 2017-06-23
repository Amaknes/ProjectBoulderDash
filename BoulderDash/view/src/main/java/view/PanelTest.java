package view;

import static org.junit.Assert.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.junit.Test;
import view.Panel;

public class PanelTest implements KeyListener {
	
	private String KeyTestLeft;
	private String KeyTestRight;
	private String KeyTestDown;
	private String KeyTestUp;
	private char[][] tab = new char[25][25];

	@Test
	public void testGetChar() {
		
		this.keyTyped(KeyEvent.VK_DOWN);
		final String expectedLeft = "Left";
		final String expectedRight = "Right";
		final String expectedDown = "Down";
		final String expectedUp = "Up";
		
		assertEquals(expectedLeft, this.KeyTestLeft);
		assertEquals(expectedRight, this.KeyTestRight);
		assertEquals(expectedDown, this.KeyTestDown);
		assertEquals(expectedUp, this.KeyTestUp);
	}

	@Override
	public void keyPressed(KeyEvent k) {
		// TODO Auto-generated method stub
		int key = k.getKeyCode();
		switch (key) {
			case KeyEvent.VK_DOWN : 
				this.KeyTestDown="Down";
				break;
			case KeyEvent.VK_UP : 
				this.KeyTestDown="Up";
				break;
			case KeyEvent.VK_LEFT : 
				this.KeyTestDown="Left";
				break;
			case KeyEvent.VK_RIGHT : 
				this.KeyTestDown="Right";
				break;
			default: break;
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
}
