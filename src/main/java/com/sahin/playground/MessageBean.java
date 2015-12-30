package com.sahin.playground;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@SessionScoped
@Named
public class MessageBean implements Serializable
{

	public String getName()
	{
		return "PLAYGROUND";
	}

}