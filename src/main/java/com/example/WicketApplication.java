package com.example;

import org.apache.wicket.protocol.http.WebApplication;

public class WicketApplication extends WebApplication
{
	@Override
	protected void init()
	{
		super.init();

		// Only delete messages which have actually been rendered.
		// This workaround used to be in an overridden session class, but moved to here as part of the wicket 6 changes.
		getApplicationSettings().setFeedbackMessageCleanupFilter(message -> message.getReporter() != null && message.isRendered());
	}

	@Override
	public Class<HomePage> getHomePage()
	{
		return HomePage.class;
	}
}
