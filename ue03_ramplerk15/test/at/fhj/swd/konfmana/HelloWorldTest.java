package at.fhj.swd.konfmana;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import at.fhj.swd.konfmana.HelloWorld;

public class HelloWorldTest {

	private HelloWorld hw;
	
	@Before
	public void setup(){
		hw = new HelloWorld();
	}
	
	@Test
	public void testConstructor(){
		hw = new HelloWorld("test");
        assertNotNull(hw);

	}
	
	@Test
	public void testGetName() {
		 hw = new HelloWorld();
         assertNull(hw.getName());

         hw = new HelloWorld("Lucky Luke");
         assertEquals(hw.getName(), "Lucky Luke");
         hw = new HelloWorld(null);
         assertEquals(hw.getName(), null);
	}

	@Test
	public void testSetName() {
		hw = new HelloWorld("test");
        assertEquals(hw.getName(), "test");
        hw.setName("King Kong");

        assertEquals(hw.getName(), "King Kong");
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
