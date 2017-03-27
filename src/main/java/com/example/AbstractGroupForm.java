package com.example;

import org.apache.wicket.markup.html.form.StatelessForm;
import org.apache.wicket.model.CompoundPropertyModel;

public abstract class AbstractGroupForm extends StatelessForm<GroupFormModel>
{
    protected AbstractGroupForm(String id)
    {
        super(id, new CompoundPropertyModel<>(new GroupFormModel()));
    }

    protected AbstractGroupForm(String id, int groupId)
    {
        super(id, new CompoundPropertyModel<>(new GroupFormModel(groupId)));
    }
}
