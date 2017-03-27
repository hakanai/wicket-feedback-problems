package com.example;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.After;
import org.junit.Before;

public abstract class WebUITestCase
{
    protected WicketTester tester;

    static
    {
        // If we don't do this, WicketTester puts crap in the current directory.
        System.setProperty("wicket.tester.work.folder", System.getProperty("java.io.tmpdir"));
    }

    @Before
    public final void setUp() throws Exception
    {
        tester = new WicketTester(new WicketApplication());
    }

    @After
    public void tearDown()
    {
        if (tester != null)
        {
            tester.destroy();
        }
    }

}
