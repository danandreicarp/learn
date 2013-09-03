package com.danandreicarp.learn.designpatterns.command;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Invoker {

	Queue<ICommand> commandQueue = new LinkedList<ICommand>();
	Stack<ICommand> undoStack = new Stack<ICommand>();

	public void invoke(final ICommand command) {
		command.execute();
		undoStack.push(command);
	}

	public void add(final ICommand command) {
		commandQueue.add(command);
	}

	public void invokeAll() {
		while (commandQueue.isEmpty() == false) {
			final ICommand command = commandQueue.poll();
			command.execute();
			undoStack.push(command);
		}
	}

	public void undo() {
		final ICommand command = undoStack.peek();
		command.undo();
		undoStack.pop();
	}

	public void undoAll() {
		while (undoStack.isEmpty() == false) {
			final ICommand command = undoStack.peek();
			command.undo();
			undoStack.pop();
		}
	}
}
