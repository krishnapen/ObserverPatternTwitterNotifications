package com.balakrishna.observer;

import java.util.ArrayList;
import java.util.List;

public class User implements Subject {

	protected List<Observer> observers = new ArrayList<Observer>();

	protected String name;

	protected String handle;

	public User(String name, String handle) {

		super();

		this.name = name;

		this.handle = "#" + handle;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getHandle() {

		return handle;

	}

	public void tweet(String tweet) {

		System.out.printf("\nName: %s, Tweet: %s\n", name, tweet);

		notifySubscribers(tweet);

	}

	public synchronized void addSubscriber(Observer observer) {

		observers.add(observer);

	}

	public synchronized void removeSubscriber(Observer observer) {

		observers.remove(observer);

	}

	public void notifySubscribers(String tweet) {

		observers.forEach(observer -> observer.notification(handle, tweet));

	}

}
