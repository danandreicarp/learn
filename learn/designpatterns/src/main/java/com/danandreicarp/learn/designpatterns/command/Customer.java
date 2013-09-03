package com.danandreicarp.learn.designpatterns.command;

public class Customer {
	private static Invoker invoker = new Invoker();
	private static IReceiver receiver = new Receiver();

	private static MoveCommand moveCommand = new MoveCommand(receiver);
	private static JumpCommand jumpCommand = new JumpCommand(receiver);

	public static void main(final String[] args) {
		moveCommand.setDistance(15);
		invoker.invoke(moveCommand);

		jumpCommand.setHeight(5);
		invoker.add(jumpCommand);
		invoker.add(moveCommand);

		invoker.invokeAll();
		invoker.undo();
		invoker.undoAll();
	}
}
