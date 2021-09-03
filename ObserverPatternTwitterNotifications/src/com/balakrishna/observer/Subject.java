package com.balakrishna.observer;

public interface Subject {

	public void addSubscriber(Observer observer);

	public void removeSubscriber(Observer observer);

	public void notifySubscribers(String tweet);

}
