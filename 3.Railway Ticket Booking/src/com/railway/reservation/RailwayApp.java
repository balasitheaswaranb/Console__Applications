package com.railway.reservation;

public class RailwayApp {
	public static void main(String args[]) {
		new RailwayApp().start();
	}

	private void start() {
		new MainView().initiate();
	}
}
