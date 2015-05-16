package com.example.twitters.model;

import java.util.ArrayList;

public class User {
	static int idgenerator = 1;
	private int id;
	private String id_str;
	private String name;
	private String screen_name;
	private String description;
	ArrayList<Tweet> tweets = new ArrayList<Tweet>();

	public User(String name, String screen_name, String description) {
		super();
		this.id = idgenerator;
		this.id_str = Integer.toString(idgenerator);
		this.name = name;
		this.screen_name = screen_name;
		this.description = description;
		idgenerator = idgenerator + 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScreen_name() {
		return screen_name;
	}

	public void setScreen_name(String screen_name) {
		this.screen_name = screen_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public String getId_str() {
		return id_str;
	}

}
