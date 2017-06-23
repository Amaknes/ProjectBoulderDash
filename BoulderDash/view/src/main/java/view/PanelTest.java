package view;

import static org.junit.Assert.*;

import org.junit.Test;
import view.Panel;

public class PanelTest {

	private char[][] tab = new char[25][25];

	@Test
	public void testGetChar() {
		Panel panel = new Panel();
		final char expected = 'W';
		assertEquals(expected, panel.getMap()[0][0]);
	}
}
