package com.sahin.playground;


import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named
public class TestBean implements Serializable
{

	@Inject
	MessageBean messageBean;

	private String name;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void sayHello()
	{
		name = messageBean.getName();
	}
}
