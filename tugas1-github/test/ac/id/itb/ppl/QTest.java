package ac.id.itb.ppl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class QTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Q q = new Q();
		q.addBarang(new P());
		q.addBarang(new P());
		q.addBarang(new P());
		assertEquals(3, q.getSizeGudang());
	}

}
