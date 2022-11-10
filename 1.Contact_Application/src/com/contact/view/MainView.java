package com.contact.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.contact.model.Database;

public class MainView {
	Scanner scanner = new Scanner(System.in);
	ManageInput userInput;
	
	MainView() {
		userInput = new ManageInput();
	}
	
	protected void initiate() {
		Database.getInstance().getDataFromDb();
		displayOptions();
	}

	private void displayOptions() {
		boolean isQuit = false;
		System.out.print("\nHii Sitheas Welcome to Contacts application \n");
		
		printOptions();
		while (!isQuit) {
			try {
			System.out.print("Enter your choice: ");
			switch (scanner.nextInt()) {
			case 0:
				printOptions();
				break;
			case 1:
				new ManageView().printAllContacts();
				break;
			case 2:
				userInput.addContacts();
				break;
			case 3:
				userInput.modifyContact();
				break;
			case 4:
				userInput.removeContact();
				break;
			case 5:
				userInput.findContact();
				break;
			case 6:
				userInput.addFavourites();
				break;
			case 7:
				isQuit = true;
				break;
			default:
				System.out.print("Please enter a valid input!");
			}
			}catch(InputMismatchException e) {
				System.out.println("Please enter the valid integer input!!!");
			    scanner.next();
			}
		}
	}
	
	private void printOptions() {

		System.out.println("\nPress any one option below\n");
		System.out.println("\t[0] - Main menu options.");
		System.out.println("\t[1] - Show all the contacts.");
		System.out.println("\t[2] - Create a new contact.");
		System.out.println("\t[3] - Modify an existing contact.");
		System.out.println("\t[4] - Delete a contact from the list.");
		System.out.println("\t[5] - Search a contact");
		System.out.println("\t[6] - Favourites");
		System.out.println("\t[7] - To quit the application.");
	}
	
}
