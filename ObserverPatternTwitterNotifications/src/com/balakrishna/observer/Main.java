package com.balakrishna.observer;

public class Main {

	public static void main(String args[]) {

		User tomHanks = new User("Tom Hanks", "tomhanks");

		Follower balaKrishna = new Follower("Balakrishna");
		Follower mike = new Follower("Mike");
		Follower taylor = new Follower("Taylor");

		tomHanks.addSubscriber(balaKrishna);
		tomHanks.addSubscriber(mike);

		tomHanks.tweet("Hello Friends!");

//Removed Subscriber won't receive notifications
		tomHanks.removeSubscriber(taylor);

		tomHanks.tweet("Stay Home! Stay Safe!");

	}

}
