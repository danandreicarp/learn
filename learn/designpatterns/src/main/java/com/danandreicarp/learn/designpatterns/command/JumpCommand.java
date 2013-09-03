package com.danandreicarp.learn.designpatterns.command;

public class JumpCommand implements ICommand {

	private final IReceiver receiver;
	private int height;

	public JumpCommand(final IReceiver receiver) {
		this.receiver = receiver;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(final int height) {
		this.height = height;
	}

	@Override
	public void execute() {
		// execute command
		receiver.jump(height);
	}

	@Override
	public void undo() {
		// undo command
		receiver.duck();
	}
}
