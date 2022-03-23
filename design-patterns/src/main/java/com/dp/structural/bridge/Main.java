package com.dp.structural.bridge;

public class Main {

	public static void main(String[] args) {

		MessageSender sender = new EmailSender();
		Message message = new EmailMessage(sender, "Welcome email");

		message.send();
	}

}
