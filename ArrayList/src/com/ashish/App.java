package com.ashish;

import java.util.ArrayList;

public class App {

	
	static ArrayList<String> listNames = new ArrayList<>();
	public static void main(String[] args) {
		listNames.add("Ashish");
		listNames.add("Leo");
		listNames.add("Ter");
		listNames.add("Pique");
		listNames.add("Suarez");
		listNames.add("Phil");
		listNames.add("Dembele");
		listNames.add("Busi");
		listNames.add("Rakitic");
		
		App app = new App();
		app.displayList(listNames);
//		app.removeNameByPosition(0);
//		System.out.println("****************************");
//		app.displayList(listNames);
		
//		System.out.println("****************************");
//		app.removeNameByString("Phil");
//		app.displayList(listNames);
		
		System.out.println("****************************");
		app.modifyName(5, "Grizmann");
		app.displayList(listNames);
		
	}
	void displayList(ArrayList<String> names) {
		for(String name: names) {
			System.out.println(name);
		}
	}
	
	void removeNameByPosition(int position) {
		listNames.remove(position);
	}
	
	void removeNameByString(String name) {
		listNames.remove(name);
	}
	
	void modifyName(int position, String newName) {
		listNames.set(position, newName); 
	}

}
