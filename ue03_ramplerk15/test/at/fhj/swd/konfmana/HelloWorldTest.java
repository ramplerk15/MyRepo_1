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
		String test1 = "Lemonhead";
		String test2 = " ";
		String test3 = "Helmet";
		String test4 = null;
	}
	
	@Test
	public void testGetName() {
		fail("Not yet implemented!");
	}

	@Test
	public void testSetName() {
		fail("Not yet implemented!");
		
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
