package com.danandreicarp.learn.designpatterns.state;

public class StateB implements IState, IStateOptional {

	@Override
	public void handle(final Context context) {
		System.out.println("state B: " + context.toString().toUpperCase());
		context.setState(new StateA());
	}

	@Override
	public void optionalOperation(final Context context) {
		System.out.println("state B optional operation: " + context.toString().substring(13).replaceAll("\\.", "#"));
	}
}
