package uk.me.daveshepherd.examples.simplejar;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSimpleClass {
	@Test
	public void testSimpleMethod() {
		SimpleClass classUnderTest = new SimpleClass();
		int length = classUnderTest.simpleMethod("string");
		assertEquals("string length", 6, length);
	}
}