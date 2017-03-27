package com.example;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.util.string.StringValue;

public class ShowGroupPage extends BaseWebPage
{
    public ShowGroupPage(PageParameters parameters)
    {
        StringValue idValue = parameters.get("id");
        if (idValue.isNull() || idValue.isEmpty())
        {
            throw new IllegalStateException("Somehow an empty ID got here");
        }

        int id = idValue.toInt();
        add(new Label("title", Model.of("Group " + id)));
        add(new DeleteGroupForm("deleteGroupForm", id));
    }


}
