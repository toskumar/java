package com.dp.structural.bridge;

abstract class Message {

	String content;
	MessageSender sender;

	Message(MessageSender sender, String content) {
		this.sender = sender;
		this.content = content;
	}

	abstract void send();
}

class TextMessage extends Message {

	public TextMessage(MessageSender sender, String content) {
		super(sender, content);
	}

	@Override
	void send() {
		this.sender.send(this.content);
	}
}

class EmailMessage extends Message {

	public EmailMessage(MessageSender sender, String content) {
		super(sender, content);
	}

	@Override
	void send() {
		this.sender.send(this.content);
	}
}

interface MessageSender {
	void send(String content);
}

class TextSender implements MessageSender {

	@Override
	public void send(String content) {
		System.out.println("Text sender and content is " + content);
	}
}

class EmailSender implements MessageSender {

	@Override
	public void send(String content) {
		System.out.println("Email sender and content is " + content);
	}
}