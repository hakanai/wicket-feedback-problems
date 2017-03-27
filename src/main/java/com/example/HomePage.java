package com.example;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class HomePage extends BaseWebPage {
	private static final long serialVersionUID = 1L;

    public HomePage(final PageParameters parameters) {
        add(new Label("title", "Home"));
        add(new BookmarkablePageLink<>("showGroupLink", ShowGroupPage.class, new PageParameters().add("id", "3")));
    }
}
