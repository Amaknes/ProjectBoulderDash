package view;

import static org.junit.Assert.*;

import org.junit.Test;
import model.ReadData;

public class PanelTest {

	private char[][] tab = new char[25][25];

	@Test
	public void testSetChar() {
		ReadData data = new ReadData();
		final char expected = 'W';
		assertEquals(expected, data.tabMap[0][0]);
	}
}
