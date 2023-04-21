package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {
	
	

	@Test
	void testBob() {
		assertEquals("Hello, Bob",Welcome.welcome("bob"));
		
		
	}

}
