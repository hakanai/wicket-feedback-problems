package com.example;

import org.apache.wicket.devutils.stateless.StatelessComponent;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.panel.FeedbackPanel;

@StatelessComponent
public abstract class BaseWebPage extends WebPage
{
    protected BaseWebPage()
    {
        setStatelessHint(true);
        add(new FeedbackPanel("feedback"));
    }

}
