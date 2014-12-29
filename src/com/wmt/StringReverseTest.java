package com.wmt;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringReverseTest {

	StringReverse stringReverse = null;
	@Before
	public void setUp() throws Exception {
		
		stringReverse = new StringReverse();
	}

	@Test
	public void equalsTest() {
		Assert.assertEquals("StringReverse Equal", "AVLES", stringReverse.reverse("SELVA"));
	}

	@Test
	public void notequalsTest() {
		Assert.assertNotEquals("StringReverse Not Equal", "SELVA", stringReverse.reverse("SELVA"));
	}
	
	@Test(expected= StringIndexOutOfBoundsException.class) // For more info : https://github.com/junit-team/junit/wiki/Exception-testing
	
	public void equalsEmptyTest() {
		Assert.assertEquals("StringReverse Equal Empty", "", stringReverse.reverse(""));
	}
	
	@Test
	public void equalsWithMultipleSpacesTest() {
		Assert.assertEquals("StringReverse Equal with spaces", "AVLES AVLES", stringReverse.reverse("SELVA SELVA"));
	}

}
