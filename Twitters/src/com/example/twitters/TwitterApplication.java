package com.example.twitters;

import com.example.twitters.model.Model;

import android.app.Application;

public class TwitterApplication extends Application {
	private static Model model;

	@Override
	public void onCreate() {
		model = new Model();
		super.onCreate();
	}

	public Model getModel() {
		return model;
	}
}
