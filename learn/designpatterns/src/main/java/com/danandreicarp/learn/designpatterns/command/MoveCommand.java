package com.danandreicarp.learn.designpatterns.command;

public class MoveCommand implements ICommand {

	private final IReceiver receiver;
	private int distance;

	public MoveCommand(final IReceiver receiver) {
		this.receiver = receiver;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(final int distance) {
		this.distance = distance;
	}

	@Override
	public void execute() {
		// execute command
		receiver.move(distance);
	}

	@Override
	public void undo() {
		// undo command
		receiver.move(-1 * distance);
	}
}
