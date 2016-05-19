package at.fhj.swd.konfmana;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



import at.fhj.swd.konfmana.HelloWorld;

public class HelloWorldTest {

	private HelloWorld hw;
	
	@Before
	public void setup(){
		hw = new HelloWorld();
	}
	
	@Test
	public void testConstructor(){
		try {
			hw = new HelloWorld("Lucky Luke");
			assertNotNull(hw);
		}
		catch (AssertionError e) {
				fail("testConstructor failed...");
		}
	}
	
	@Test
	public void testGetName() {
		try {
			hw = new HelloWorld();
			assertNull(hw.getName());
			hw = new HelloWorld("King Kong");
			assertNotNull(hw.getName());
			assertEquals(hw.getName(), "King Kong");
		}
		catch (AssertionError e) {
				fail("testGetName failed...");
		}
	}

	@Test
	public void testSetName() {
		try {
			hw = new HelloWorld("Minnie Mouse");
			assertEquals(hw.getName(), "Minnie Mouse");
			hw.setName("Peter Pan");
			assertEquals(hw.getName(), "Peter Pan");
		}
		catch (AssertionError e) {
			fail("testSetName failed...");
		}
	}

	public void testToString() {
		assertEquals("Hello World!", hw.toString());
		hw.setName("     ");
		assertEquals("Hello World!", hw.toString());
		hw.setName("   Lemonhead   ");
		assertEquals("Hello World! Hello Lemonhead!", hw.toString());
		hw.setName("");
		assertEquals("Hello World!", hw.toString());
		hw.setName(null);
		assertEquals("Hello World!", hw.toString());
		hw.setName("Helmet");
		assertEquals("Hello World! Hello Helmet!", hw.toString());
	}

}
