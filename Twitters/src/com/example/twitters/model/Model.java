package com.example.twitters.model;

import java.util.ArrayList;
import java.util.Observable;

import com.example.twitters.view.Adapter;

public class Model extends Observable {
	ArrayList<User> users = new ArrayList<User>();

	public void addObsever(Adapter adaper) {

	}

	public ArrayList<User> getList() {
		setChanged();
		notifyObservers();
		return users;
	}

	public void addUser(User user) {
		setChanged();
		notifyObservers();
		users.add(user);
	}
}
