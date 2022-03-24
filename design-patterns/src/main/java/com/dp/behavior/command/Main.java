package com.dp.behavior.command;

public class Main {

	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
		Light light = new Light("Geen");
		Command commandOn = new LightOnCommand(light);
		Command commandOff = new LightOffCommand(light);

		remote.setCommand(commandOn, commandOff);
		remote.buttonOnOffPressed();
		remote.buttonOnOffPressed();
		remote.buttonOnOffPressed();
	}

}
