package com.exercise50jsfbeans.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="welcomeBean")
@SessionScoped
public class Welcome {
	@ManagedProperty(value="#{welcomeMenssage}")
		public String welcomeMenssage;

	public String getWelcomeMenssage() {
		return welcomeMenssage ="holo vgaa";
	}

	public void setWelcomeMenssage(String welcomeMenssage) {
		this.welcomeMenssage = welcomeMenssage;
	}
}
