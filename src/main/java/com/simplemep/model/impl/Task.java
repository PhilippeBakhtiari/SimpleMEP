package com.simplemep.model.impl;

import java.util.List;

import com.simplemep.model.IImpact;

public class Task {
	private String name;
	private String user;
	private String description;
	private List<IImpact> impactProjectsList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<IImpact> getImpactProjectsList() {
		return impactProjectsList;
	}

	public void setImpactProjectsList(List<IImpact> impactProjectsList) {
		this.impactProjectsList = impactProjectsList;
	}
}
