package com.jcastro.wiki.training;
//
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AnnotationTests {
	@Test(groups = {"grupo1"})
	public void testEqualsIgnoreCase() {
		String a = "hOla MuNDO";
		String b = "hola mundo";
		System.out.println("tes1");
		Assert.assertTrue(a.equalsIgnoreCase(b));
	}
	
	@Parameters({ "StringC", "StringD" })
	@Test(groups = {"grupo1"})
	public void testConcact(String c, String d) {
//		String c = "I love ";
//		String d = "test automation";
		String resultado = c + d;
		System.out.println( resultado);
		Assert.assertEquals(resultado, "I love testutomation");
	}

	@Test (groups = {"grupo2"})
	public void testCount() {
		String a = "I love";
		Assert.assertEquals(a.length(), 6);
	}
	
	@Test(groups = {"grupo2"})
	public void testConcat() {
		System.out.println("test 1");
	}
	
	@Test(groups = {"grupo1"})
	public void testCounta() {
		System.out.println("test 2");
	}
}