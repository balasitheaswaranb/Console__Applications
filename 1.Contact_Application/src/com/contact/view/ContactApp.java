package com.contact.view;

public class ContactApp {
	public static void main(String[] args) {
		new ContactApp().start();
	}

	private void start() {
		new MainView().initiate();
	}
}
