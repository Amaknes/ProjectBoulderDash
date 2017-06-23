package view;

import static org.junit.Assert.*;

import org.junit.Test;
import view.Panel;

/**
 * Testing the recuperation of a map
 * 
 * @author Loïck Legay
 * @version 1.0
 */
public class PanelTest {

	private char[][] tab = new char[25][25];

	@Test
	public void testGetChar() {
		Panel panel = new Panel();
		final char expected = 'W';
		assertEquals(expected, panel.getMap()[0][0]);
	}
}
