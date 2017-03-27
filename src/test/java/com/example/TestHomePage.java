package com.example;

import org.junit.Test;

public class TestHomePage extends WebUITestCase
{
	@Test
	public void testRender()
	{
		//start and render the test page
		tester.startPage(HomePage.class);

		//assert rendered page class
		tester.assertRenderedPage(HomePage.class);
	}
}
