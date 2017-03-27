package com.example;

import org.apache.wicket.markup.html.form.HiddenField;
import org.apache.wicket.model.PropertyModel;

public class DeleteGroupForm extends AbstractGroupForm
{
    public DeleteGroupForm(String id, int groupId)
    {
        super(id, groupId);

        GroupFormModel model = getModelObject();
        add(new HiddenField<>("id", new PropertyModel<>(model, "id")));

    }

    @Override
    protected void onSubmit()
    {
        // stubbed
        info("Deleted " + getModelObject().getName());

        setResponsePage(HomePage.class);
    }
}
