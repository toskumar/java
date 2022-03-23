package com.dp.structural.facade;

public class Main {

	public static void main(String[] args) {

		OrderServiceFacade orderFacade = new OrderServiceFacadeImpl();
		orderFacade.placeOrder(101);

	}

}
