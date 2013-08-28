package com.danandreicarp.learn.designpatterns.state;

public class StateA implements IState {

	@Override
	public void handle(final Context context) {
		System.out.println("state A: " + context.toString().toLowerCase());
		context.setState(new StateB());
	}

}
