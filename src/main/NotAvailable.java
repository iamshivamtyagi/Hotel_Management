package main;

public class NotAvailable extends Exception {
	@Override
	public String toString() {
		return "Not Available !";
	}
}