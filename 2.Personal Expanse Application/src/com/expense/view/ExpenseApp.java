package com.expense.view;

public class ExpenseApp {

	public static void main(String[] args) {
		new ExpenseApp().start();
	}

	private void start() {
		System.out.println("********** Welcome to Expense manager app **********");
		new MainView().initiate();
	}

}
