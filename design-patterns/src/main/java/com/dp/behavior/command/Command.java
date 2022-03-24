package com.dp.behavior.command;

interface Command {
	public void execute();
}

class Light {

	String name;

	Light(String name) {
		this.name = name;
	}

	public void on() {
		System.out.println(this.name + " Light is on");
	}

	public void off() {
		System.out.println(this.name + " Light is off");
	}
}

class LightOnCommand implements Command {

	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		this.light.on();
	}
}

class LightOffCommand implements Command {

	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		this.light.off();
	}
}

class RemoteControl {
	Command command;

	Command commandOn;
	Command commandOff;
	boolean onoff = false;

	RemoteControl() {
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void setCommand(Command commandOn, Command commandOff) {
		this.commandOn = commandOn;
		this.commandOff = commandOff;
	}

	public void buttonOnOffPressed() {
		if (onoff) {
			this.commandOff.execute();
			onoff = false;
		} else {
			this.commandOn.execute();
			onoff = true;
		}
	}

	public void buttonPressed() {
		this.command.execute();
	}
}
