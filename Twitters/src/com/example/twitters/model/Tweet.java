package com.example.twitters.model;

public class Tweet {
	static int idgenerator = 1;
	private int id;
	private String id_str;
	private String text;
	private String source;

	public Tweet(String text, String source) {
		super();
		this.id = idgenerator;
		this.id_str = Integer.toString(idgenerator);
		this.text = text;
		this.source = source;
		idgenerator = idgenerator + 1;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getId() {
		return id;
	}

	public String getId_str() {
		return id_str;
	}

	public String getSource() {
		return source;
	}

}
