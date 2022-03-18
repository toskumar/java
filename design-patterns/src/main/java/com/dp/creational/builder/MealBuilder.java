package com.dp.creational.builder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import lombok.Data;

@Data
class Item {
	String name;
	int price;

	Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

class MealBox {

	Map<Item, Integer> items = new HashMap<Item, Integer>();
	int billAmount = 0;

	void addItem(Item item, int qty) {

		if (qty > 0 && !items.containsKey(item)) {
			this.items.put(item, qty);
			this.billAmount += qty * item.price;
		}

	}

	void removeItem(Item item) {
		items.remove(item);
	}

	public Map<Item, Integer> getItems() {
		return items;
	}

	int getBillAmount() {
		return this.billAmount;
	}
}

public class MealBuilder {

	static Item burger, cake, icecream;

	static {
		burger = new Item("Burger    ", 99);
		cake = new Item("Lava Cake ", 50);
		icecream = new Item("Icecream  ", 75);
	}

	MealBox mealBox = new MealBox();

	public MealBuilder() {

	}

	MealBuilder addBurger(int qty) {
		this.mealBox.addItem(burger, qty);
		return this;
	}

	MealBuilder removeBurger() {
		this.mealBox.removeItem(burger);
		return this;
	}

	MealBuilder addCake(int qty) {
		this.mealBox.addItem(cake, qty);
		return this;
	}

	MealBuilder removeCake() {
		this.mealBox.removeItem(cake);
		return this;
	}

	MealBuilder addIcecream(int qty) {
		this.mealBox.addItem(icecream, qty);
		return this;
	}

	MealBuilder removeIcream() {
		this.mealBox.removeItem(icecream);
		return this;
	}

	void printBill() {

		System.out.println("Name        Qty   Price  Total ");

		Map<Item, Integer> items = this.mealBox.getItems();

		Iterator<Item> iter = items.keySet().iterator();

		while (iter.hasNext()) {
			Item item = iter.next();
			int qty = (Integer) items.get(item);
			System.out.println(item.name + "  " + qty + "     " + item.price + "     " + (qty * item.price));

		}

		System.out.println("Total Amount = "  + this.mealBox.getBillAmount());
	}
}
