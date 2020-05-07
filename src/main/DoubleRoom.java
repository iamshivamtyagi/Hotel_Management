package main;

import java.io.Serializable;

public class DoubleRoom extends SingleRoom implements Serializable {
	String name2;
	String contact2;
	String gender2;

	DoubleRoom() {
		this.name = "";
		this.name2 = "";
	}

	DoubleRoom(String name, String contact, String gender, String name2, String contact2, String gender2) {
		this.name = name;
		this.contact = contact;
		this.gender = gender;
		this.name2 = name2;
		this.contact2 = contact2;
		this.gender2 = gender2;
	}
}