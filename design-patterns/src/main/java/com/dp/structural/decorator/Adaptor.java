package com.dp.structural.decorator;

interface Socket {
	void multiPin();
}

class IndianSocket implements Socket {

	@Override
	public void multiPin() {
		System.out.println("Indian type socket multipin");
	}
}

class ChineseSocket {

	void multiPurposePin() {
		System.out.println("Chinese type socket multipin");
	}
}

class ChineseAdapter implements Socket {

	ChineseSocket socket;
	public ChineseAdapter(ChineseSocket socket) {
		this.socket = socket;
	}
	
	@Override
	public void multiPin() {
		this.socket.multiPurposePin();
	}

}

