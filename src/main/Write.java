package main;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Write implements Runnable {
	Holder ob;

	Write(Holder ob) {
		this.ob = ob;
	}

	@Override
	public void run() {
		try {
			FileOutputStream fout = new FileOutputStream("backup");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
			oos.writeObject(ob);
			oos.close();
		} catch (Exception e) {
			System.out.println("Error in writing " + e);
		}
	}

}