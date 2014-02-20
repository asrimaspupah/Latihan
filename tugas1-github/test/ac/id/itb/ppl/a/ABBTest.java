package ac.id.itb.ppl.a;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ABBTest {

	private ABB abb;
	
	@Before
	public void setUp() throws Exception {
		abb = new ABB();
	}

	@Test
	public void testGetX() {
		abb.setX(10);
		assertEquals(10, abb.getX());
		
	}
	
	@Test
	public void testGetX2() {
		abb.setX(12);
		assertEquals(13, abb.getX());
	}

}
