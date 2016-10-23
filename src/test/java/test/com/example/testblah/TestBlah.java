package test.com.example.testblah;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.javadoctest.JavadocTest;

public class TestBlah
{
	@Test
	public void testBlah()
	{
		String name = JavadocTest.getName();
		assertEquals("Mary Jane",name);
	}

}
