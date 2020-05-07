package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try {
			File file = new File("backup");
			if (file.exists()) {
				FileInputStream fin = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fin);
				Hotel.ob = (Holder) ois.readObject();
			}
			Scanner sc = new Scanner(System.in);
			int choice1, choice2;
			char wantToContinue;
			x: do {

				System.out.println(
						"\nEnter Your Choice :\n1.Show Room Details\n2.Show Room Availability \n3.Book Room\n4.Order Food\n5.Checkout Now\n6.Quit\n");
				choice1 = sc.nextInt();
				switch (choice1) {
				case 1:
					System.out.println(
							"\nChoose Room Type :\n1.Luxury Double Bedroom \n2.Deluxe Double Bedroom \n3.Luxury Single Bedroom \n4.Deluxe Single Bedroom \n");
					choice2 = sc.nextInt();
					Hotel.features(choice2);
					break;
				case 2:
					System.out.println(
							"\nChoose Room Type :\n1.Luxury Double Bedroom\n2.Deluxe Double Bedroom\n3.Luxury Single Bedroom\n4.Deluxe Single Bedroom\n");
					choice2 = sc.nextInt();
					Hotel.availability(choice2);
					break;
				case 3:
					System.out.println(
							"\nChoose Room Type :\n1.Luxury Double Bedroom\n2.Deluxe Double Bedroom\n3.Luxury Single Bedroom\n4.Deluxe Single Bedroom\n");
					choice2 = sc.nextInt();
					Hotel.bookroom(choice2);
					break;
				case 4:
					System.out.print("Room Number -");
					choice2 = sc.nextInt();
					if (choice2 > 60)
						System.out.println("Room doesn't exist");
					else if (choice2 > 40)
						Hotel.order(choice2 - 41, 4);
					else if (choice2 > 30)
						Hotel.order(choice2 - 31, 3);
					else if (choice2 > 10)
						Hotel.order(choice2 - 11, 2);
					else if (choice2 > 0)
						Hotel.order(choice2 - 1, 1);
					else
						System.out.println("Room doesn't exist");
					break;
				case 5:
					System.out.print("Room Number -");
					choice2 = sc.nextInt();
					if (choice2 > 60)
						System.out.println("Room doesn't exist");
					else if (choice2 > 40)
						Hotel.deallocate(choice2 - 41, 4);
					else if (choice2 > 30)
						Hotel.deallocate(choice2 - 31, 3);
					else if (choice2 > 10)
						Hotel.deallocate(choice2 - 11, 2);
					else if (choice2 > 0)
						Hotel.deallocate(choice2 - 1, 1);
					else
						System.out.println("Room doesn't exist");
					break;
				case 6:
					break x;
				default:
					System.out.println("Invalid Option !!!");
				}
				System.out.println("\nContinue : (y/n)");
				wantToContinue = sc.next().charAt(0);
				if (!(wantToContinue == 'y' || wantToContinue == 'Y' || wantToContinue == 'n'
						|| wantToContinue == 'N')) {
					System.out.println("Invalid Option");
					System.out.println("\nContinue : (y/n)");
					wantToContinue = sc.next().charAt(0);
				}

			} while (wantToContinue == 'y' || wantToContinue == 'Y');

			Thread t = new Thread(new Write(Hotel.ob));
			t.start();
		} catch (Exception e) {
			System.out.println("Not a valid input");
		}
	}
}
