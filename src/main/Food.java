package main;

import java.io.Serializable;

public class Food implements Serializable {
	int itemNo;
	int quantity;
	float cost;

	protected Food(int itemno, int quantity) {
		this.itemNo = itemno;
		this.quantity = quantity;
		switch (itemNo) {
		case 1:
			cost = quantity * 50;
			break;
		case 2:
			cost = quantity * 60;
			break;
		case 3:
			cost = quantity * 70;
			break;
		case 4:
			cost = quantity * 30;
			break;
		}
	}
}