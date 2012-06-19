package test;

import static org.junit.Assert.*;

import org.junit.Test;
import gui.TableModelEvent;

public class TableModelEventTest {

	@Test
	public void test1() {
		TableModelEvent test1 = new TableModelEvent("", "", "");
		assertEquals(1, test1.getRowCount());
	
		
	}
	
	

}
