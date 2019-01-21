package com.example.demo.strategyandcmd;

public class VolumeCommand implements Command {
	private Device device;

	public VolumeCommand(Device device) {
		this.device = device;
	}

	@Override
	public void exe() {
		device.volumeUp();
	}

	@Override
	public void unexe() {
		device.volumeDown();
	}
}
