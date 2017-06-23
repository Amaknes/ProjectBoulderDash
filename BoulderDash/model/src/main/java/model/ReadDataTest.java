package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import model.ReadData;

public class ReadDataTest {
	private char[][] tab = new char[25][25];
	
	@Test
	public void testGetChar() {
		ReadData data = new ReadData();
        final char expected = 'W';
        assertEquals(expected, data.tabMap[0][0]);

    }

}
