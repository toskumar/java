package com.dp.structural.facade;

import lombok.ToString;

@ToString
class Product {
	int id;
	String name;
	double price;

	Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

class InventoryService {
	Product getProduct(int id) {
		return new Product(id, "P-" + id, Math.random() * 500);
	}
}

class PaymentService {
	public static boolean makePayment() {
		System.out.println("payment processed");
		return true;
	}
}

class ShippingService {
	public static void shipProduct() {
		System.out.println("product shipping processed");
	}
}

interface OrderServiceFacade {
	public boolean placeOrder(int productId);
}

class OrderServiceFacadeImpl implements OrderServiceFacade {
	@Override
	public boolean placeOrder(int productId) {

		InventoryService service = new InventoryService();
		Product product = service.getProduct(productId);

		System.out.println(product);
		PaymentService.makePayment();
		ShippingService.shipProduct();

		return true;

	}
}