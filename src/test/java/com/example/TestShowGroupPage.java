package com.example;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.util.tester.FormTester;
import org.junit.Test;

public class TestShowGroupPage extends WebUITestCase
{
    @Test
    public void testRender()
    {
        tester.startPage(ShowGroupPage.class, new PageParameters().add("id", "3"));
        tester.assertRenderedPage(ShowGroupPage.class);
    }

    @Test
    public void testDelete()
    {
        tester.startPage(ShowGroupPage.class, new PageParameters().add("id", "3"));

        FormTester deleteGroupForm = tester.newFormTester("deleteGroupForm");
        deleteGroupForm.submit();

        tester.assertRenderedPage(HomePage.class);
        tester.assertInfoMessages("Deleted Group 3");
    }
}
