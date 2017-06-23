package view;

import static org.junit.Assert.*;

import org.junit.Test;

public class PanelTest {

	private char[][] tab = new char[25][25];

	@Test
	public void testGetChar() {
		final char expected = 'W';
		this.char.setChar(0, 0, 'A');
		assertEquals(expected, this.char.getChar(0, 0));

	}

	@Test
	public void testSetChar() {
		final char expected = 'A';
		this.array.setChar(0, 0, 'A');
		assertEquals(expected, this.array.getChar(0, 0));
		}
}