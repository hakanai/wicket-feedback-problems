package com.example;

import org.apache.wicket.util.io.IClusterable;

public class GroupFormModel implements IClusterable
{
    private int id;
    private String name;

    public GroupFormModel()
    {
        id = -1;
        name = "";
    }

    public GroupFormModel(int groupId)
    {
        id = groupId;
        name = "Group " + groupId;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
