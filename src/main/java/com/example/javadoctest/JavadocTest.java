package com.example.javadoctest;

import java.nio.charset.StandardCharsets;

/**
 * Class to Test javadoc
 * @author muquit@muquit.com - Oct 23, 2016
 */
public class JavadocTest
{
	private JavadocTest(){}
	
	public static Blah blah()
	{
		Blah blah = SingletonHelper.instance;
		return blah;
	}
	
	private static final class SingletonHelper
	{
		public static final Blah instance = (Blah) null;
	}
	
	private interface Blah 
	{
		int foobar();
	}
	
	/**
	 * Return pass phrase bytes in UTF-8 format
	 * @param foo not used
	 * @return array of bytes
	 * <p>
	 * @author muquit@muquit.com - Oct 23, 2016
	 */
	public static byte[] fooPassphrase(byte[] foo)
	{
		String banglaStr = "বাংলা";
		return banglaStr.getBytes(StandardCharsets.UTF_8);
	}
	
	/**
	 * Return the full name
	 * 
	 * @return full name
	 * <p>
	 * @author muquit@muquit.com - Oct 23, 2016
	 */
	public static String getName()
	{
		return "Mary Jane";
	}
}
